fn largest<T: PartialOrd>(list: &[T]) -> &T {
    let mut largest = &list[0];
    for item in list {
        if item > largest {
            largest = item;
        }
    }

    largest
}

#[test]
fn largest_test() {
    let number_list = vec![34, 50, 25, 100, 65];
    let result = largest(&number_list);
    assert_eq!(*result, 100);

    let char_list = vec!['y', 'm', 'a', 'q'];
    let result = largest(&char_list);
    assert_eq!(*result, 'y');
}
