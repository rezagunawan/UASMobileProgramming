// Link API Wordpress
// Ulfah Choriun Nissa

package com.mine.suakaonline.constant;

public class Const {

    public static final String url = "http://suakaonline.com/wp-json/wp/v2/posts/?per_page=20&fields=id,date,link,title,better_featured_image";

    public static final String get_categories_url = "http://suakaonline.com/wp-json/wp/v2/categories?fields=id,description,name";

    public static final String get_all_posts_of_category_url = "http://suakaonline.com/wp-json/wp/v2/posts?categories=CATEGORY_ID&fields=id,date,link,title,better_featured_image";

    public static final String get_content_by_id = "http://suakaonline.com/wp-json/wp/v2/posts/POST_ID?fields=content";

    public static final String pages = "http://suakaonline.com/wp-json/wp/v2/pages/PAGE_ID?fields=content";

}