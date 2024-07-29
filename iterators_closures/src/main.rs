use std::collections::HashMap;
use std::hash::Hash;
use std::thread;
use std::time::Duration;

fn main() {
    let simulated_user_specified_value = 10;
    let simulated_random_number = 7;

    generate_workout(simulated_user_specified_value, simulated_random_number);
}

struct Cacher<T, K, V>
where
    T: Fn(&K) -> V,
    K: Eq + Hash + Clone,
    V: Clone,
{
    calculation: T,
    value: HashMap<K, V>,
}

impl<T, K, V> Cacher<T, K, V>
where
    T: Fn(&K) -> V,
    K: Eq + Hash + Clone,
    V: Clone,
{
    fn new(calculation: T) -> Cacher<T, K, V> {
        Cacher {
            calculation,
            value: HashMap::new(),
        }
    }

    fn value(&mut self, arg: K) -> V {
        match self.value.get(&arg) {
            Some(v) => v.clone(),
            None => {
                let v = (self.calculation)(&arg);
                self.value.insert(arg.clone(), v.clone());
                v
            }
        }
    }
}

fn generate_workout(intensity: i32, random_number: i32) {
    let mut expensive_result = Cacher::new(|num| {
        println!("calculating slowly...");
        thread::sleep(Duration::from_secs(2));
        num << 1
    });

    if intensity < 25 {
        println!("Today, do {} pushups!", expensive_result.value(intensity));
        println!("Next, do {} situps!", expensive_result.value(intensity));
    } else if random_number == 3 {
        println!("Take a break today! Remember to stay hydrated!");
    } else {
        println!(
            "Today, run for {} minutes!",
            expensive_result.value(intensity)
        )
    }
}

fn _test() {
    let example_closure = |x| x;
    let _s = example_closure(String::from("hello"));
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn call_with_different_values() {
        let mut c = Cacher::new(|a| *a);

        let _v1 = c.value(1);
        let v2 = c.value(2);

        assert_eq!(v2, 2);
    }

    #[test]
    fn call_with_same_value() {
        let mut c = Cacher::new(|a| *a);

        let v1 = c.value(1);
        let v2 = c.value(1);

        assert_eq!(v1, 1);
        assert_eq!(v2, 1);
    }

    #[test]
    fn call_with_different_functions() {
        let mut c1 = Cacher::new(|a| a + 1);
        let mut c2 = Cacher::new(|a| a * 2);

        let v1 = c1.value(2);
        let v2 = c2.value(2);

        assert_eq!(v1, 3);
        assert_eq!(v2, 4);
    }
}
