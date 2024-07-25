mod lib;
mod new_article;
mod tweet;

use crate::traits::lib::Summary;
use crate::traits::new_article::NewArticle;
use crate::traits::tweet::Tweet;

#[test]
fn trait_tweet_test() {
    let tweet = Tweet {
        username: String::from("horse_ebooks"),
        content: String::from("of course, as you probably already know, people"),
        reply: false,
        retweet: false,
    };

    println!("1 new tweet: {}", tweet.summarize());
}

#[test]
fn trait_new_article_test() {
    let new_article = NewArticle {
        headline: String::from("Penguins win the Stanley Cup Championship!"),
        location: String::from("Pittsburgh, PA, USA"),
        author: String::from("Iceburgh"),
        content: String::from(
            "The Pittsburgh Penguins once again are the best \
             hockey team in the NHL.",
        ),
    };

    println!("New article available! {}", new_article.summarize());
}
