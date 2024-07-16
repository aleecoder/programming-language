use std::collections::HashMap;

#[test]
fn hashmap_create() {
    let mut scores = HashMap::<String, i32>::new();
    scores.insert(String::from("Blue"), 10);
    scores.insert(String::from("Yellow"), 50);
    scores.insert(String::from("Red"), 25);
    println!("{:?}", scores);
}

#[test]
fn hashmap_create_from_collection() {
    let teams = vec![
        String::from("Blue"),
        String::from("Yellow"),
        String::from("Red"),
    ];
    let initial_scores = vec![10, 50, 25];
    let scores: HashMap<_, _> = teams.iter().zip(initial_scores.iter()).collect();
    println!("{:?}", scores);
}

#[test]
fn hashmap_ownership() {
    let field_name = String::from("Favorite color");
    let field_value = String::from("Blue");

    let mut map = HashMap::new();
    // 如果将拥有所有权的值插入到HashMap中，则所有权会转移
    // map.insert(field_name, field_value);
    // 如果将值的引用插入到HashMap中，则所有权不会转移
    map.insert(&field_name, &field_value);

    println!("{}: {}", field_name, field_value);
}

#[test]
fn hashmap_visit() {
    let mut scores = HashMap::new();
    scores.insert(String::from("Blue"), 10);
    scores.insert(String::from("Yellow"), 50);
    scores.insert(String::from("Red"), 25);

    let team_name = String::from("Blue");
    let score = scores.get(&team_name);
    match score {
        Some(score) => println!("{}'s score is {}", team_name, score),
        None => println!("{} not found", team_name),
    }

    for (key, value) in &scores {
        println!("{}: {}", key, value);
    }

    println!("{:?}", score)
}

#[test]
fn hashmap_update() {
    let mut scores = HashMap::new();
    scores.insert(String::from("Blue"), 10);
    scores.insert(String::from("Yellow"), 50);
    scores.insert(String::from("Red"), 25);

    // 如果键不存在，则插入键值对
    scores.entry(String::from("Blue")).or_insert(50);
    scores.entry(String::from("Green")).or_insert(50);

    println!("{:#?}", scores);

    let text = "hello world wonderful world";
    let mut map = HashMap::new();
    for word in text.split_whitespace() {
        let count = map.entry(word).or_insert(0); // 返回的是可变的引用
        *count += 1;
    }

    println!("{:#?}", map)
}
