package helpers;

import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterOauth {

	public static void main(String[] args) {
		
		ConfigurationBuilder confTwitter = new ConfigurationBuilder();
		confTwitter.setDebugEnabled(true)
		.setOAuthConsumerKey("5e7h7sJBNyBHTUFiZ27L8SD4e")
		.setOAuthConsumerSecret("be28Fazvy4n6BXaazoVJNKTdR0Zdkt90qhmp0gBuPfctrLXzKz")
		.setOAuthAccessToken("904303774965133312-Ot2ROJpLeluhYufn6K9T7J8PrnUO15S")
		.setOAuthAccessTokenSecret("rxhaf4YfieCefB1KjppacgsLdtXglQMdILnTSe5ugbe5E");
		
		TwitterFactory tf = new TwitterFactory(confTwitter.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
	}

}
