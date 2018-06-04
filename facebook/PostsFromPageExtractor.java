/**
 * @(#)PostsFromPageExtractor.java
 *
 *
 * @author 
 * @version 1.00 2018/5/22
 */



import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;


public class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
	//ambil dari https://developers.facebook.com/apps/
    facebook.setOAuthAppId("2557758164240337", "d136bf1cf0ba8dfee58ae9a79750db98");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAACEdEose0cBADYbTkwI5CQLbWOtegX2GkLZA3GU9kMeS5TggAE7nLjukSrpq53P8o4TA7lFeK9eaPffdNh5bMZAgikBDw9V6w7OrHMaq2rGb1zlTRZAhXClbRtd7a4jEoaqHEOi13CQtCegVDi8j8I3WCnQeDMWiFUbA0nvEL6KJPaaBLc1GgYkqGdgN844Gr6gUpUzAZDZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

    // We're done.
    // Access group feeds.
    // You can get the group ID from:
    // https://developers.facebook.com/tools/explorer

    // Set limit to 25 feeds.
    facebook.postStatusMessage("tugass web sevice."); 
        }           
    
}