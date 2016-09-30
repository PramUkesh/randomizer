package com.infoedge.jrandomizer.providers;

/**
 * Created by gagandeep on 31/7/16.
 */

public class AppBundleIdProvider extends FromJsonProvider<AppBundleIdProvider.AppBundleIdData> {

    private AppBundleIdProvider(Class<AppBundleIdData> clazz) {
        super(clazz);
    }

    @Override
    protected String json() {
        return "{\n" +
                "  \"tlds\": [\n" +
                "    \"com\",\n" +
                "    \"info\",\n" +
                "    \"cz\",\n" +
                "    \"de\",\n" +
                "    \"org\",\n" +
                "    \"edu\",\n" +
                "    \"uk\",\n" +
                "    \"jp\",\n" +
                "    \"net\",\n" +
                "    \"gov\",\n" +
                "    \"pl\",\n" +
                "    \"ru\",\n" +
                "    \"br\",\n" +
                "    \"fm\",\n" +
                "    \"cn\",\n" +
                "    \"ca\",\n" +
                "    \"be\",\n" +
                "    \"fr\",\n" +
                "    \"it\",\n" +
                "    \"ly\",\n" +
                "    \"au\",\n" +
                "    \"io\",\n" +
                "    \"gl\",\n" +
                "    \"me\",\n" +
                "    \"cc\",\n" +
                "    \"us\",\n" +
                "    \"eu\",\n" +
                "    \"hk\",\n" +
                "    \"vu\",\n" +
                "    \"tv\",\n" +
                "    \"es\",\n" +
                "    \"gd\",\n" +
                "    \"mil\",\n" +
                "    \"ch\",\n" +
                "    \"co\",\n" +
                "    \"nl\"\n" +
                "  ],\n" +
                "  \"companyNames\": [\n" +
                "    \"multiply\",\n" +
                "    \"livejournal\",\n" +
                "    \"parallels\",\n" +
                "    \"theatlantic\",\n" +
                "    \"aboutads\",\n" +
                "    \"salon\",\n" +
                "    \"phoca\",\n" +
                "    \"hao123\",\n" +
                "    \"e-recht24\",\n" +
                "    \"bloglines\",\n" +
                "    \"slashdot\",\n" +
                "    \"youtube\",\n" +
                "    \"arizona\",\n" +
                "    \"co\",\n" +
                "    \"fotki\",\n" +
                "    \"eepurl\",\n" +
                "    \"springer\",\n" +
                "    \"globo\",\n" +
                "    \"ycombinator\",\n" +
                "    \"redcross\",\n" +
                "    \"paypal\",\n" +
                "    \"rediff\",\n" +
                "    \"hp\",\n" +
                "    \"godaddy\",\n" +
                "    \"walmart\",\n" +
                "    \"cnet\",\n" +
                "    \"sourceforge\",\n" +
                "    \"scribd\",\n" +
                "    \"webmd\",\n" +
                "    \"wikispaces\",\n" +
                "    \"examiner\",\n" +
                "    \"msu\",\n" +
                "    \"aol\",\n" +
                "    \"friendfeed\",\n" +
                "    \"hibu\",\n" +
                "    \"utexas\",\n" +
                "    \"ed\",\n" +
                "    \"studiopress\",\n" +
                "    \"reuters\",\n" +
                "    \"nbcnews\",\n" +
                "    \"google\",\n" +
                "    \"icq\",\n" +
                "    \"yandex\",\n" +
                "    \"constantcontact\",\n" +
                "    \"engadget\",\n" +
                "    \"creativecommons\",\n" +
                "    \"cpanel\",\n" +
                "    \"com\",\n" +
                "    \"last\",\n" +
                "    \"amazonaws\",\n" +
                "    \"ameblo\",\n" +
                "    \"slideshare\",\n" +
                "    \"example\",\n" +
                "    \"house\",\n" +
                "    \"wordpress\",\n" +
                "    \"seattletimes\",\n" +
                "    \"hhs\",\n" +
                "    \"cbc\",\n" +
                "    \"gov\",\n" +
                "    \"sciencedaily\",\n" +
                "    \"stanford\",\n" +
                "    \"time\",\n" +
                "    \"youtu\",\n" +
                "    \"cisco\",\n" +
                "    \"sogou\",\n" +
                "    \"census\",\n" +
                "    \"addtoany\",\n" +
                "    \"nationalgeographic\",\n" +
                "    \"craigslist\",\n" +
                "    \"1688\",\n" +
                "    \"psu\",\n" +
                "    \"jimdo\",\n" +
                "    \"github\",\n" +
                "    \"nps\",\n" +
                "    \"cargocollective\",\n" +
                "    \"economist\",\n" +
                "    \"sbwire\",\n" +
                "    \"liveinternet\",\n" +
                "    \"altervista\",\n" +
                "    \"cocolog-nifty\",\n" +
                "    \"berkeley\",\n" +
                "    \"sohu\",\n" +
                "    \"360\",\n" +
                "    \"themeforest\",\n" +
                "    \"umich\",\n" +
                "    \"chronoengine\",\n" +
                "    \"loc\",\n" +
                "    \"bizjournals\",\n" +
                "    \"amazon\",\n" +
                "    \"ucoz\",\n" +
                "    \"wunderground\",\n" +
                "    \"indiegogo\",\n" +
                "    \"free\",\n" +
                "    \"mayoclinic\",\n" +
                "    \"tuttocitta\",\n" +
                "    \"feedburner\",\n" +
                "    \"whitehouse\",\n" +
                "    \"huffingtonpost\",\n" +
                "    \"joomla\",\n" +
                "    \"yale\",\n" +
                "    \"buzzfeed\",\n" +
                "    \"diigo\",\n" +
                "    \"discuz\",\n" +
                "    \"vinaora\",\n" +
                "    \"netscape\",\n" +
                "    \"senate\",\n" +
                "    \"java\",\n" +
                "    \"hc360\",\n" +
                "    \"twitter\",\n" +
                "    \"shutterfly\",\n" +
                "    \"theglobeandmail\",\n" +
                "    \"ftc\",\n" +
                "    \"freewebs\",\n" +
                "    \"tripadvisor\",\n" +
                "    \"webnode\",\n" +
                "    \"hubpages\",\n" +
                "    \"topsy\",\n" +
                "    \"nifty\",\n" +
                "    \"ebay\",\n" +
                "    \"kickstarter\",\n" +
                "    \"nba\",\n" +
                "    \"state\",\n" +
                "    \"mozilla\",\n" +
                "    \"imdb\",\n" +
                "    \"over-blog\",\n" +
                "    \"accuweather\",\n" +
                "    \"slate\",\n" +
                "    \"cafepress\",\n" +
                "    \"ehow\",\n" +
                "    \"ft\",\n" +
                "    \"mysql\",\n" +
                "    \"i2i\",\n" +
                "    \"a8\",\n" +
                "    \"nydailynews\",\n" +
                "    \"ow\",\n" +
                "    \"reverbnation\",\n" +
                "    \"ucsd\",\n" +
                "    \"usda\",\n" +
                "    \"vk\",\n" +
                "    \"un\",\n" +
                "    \"w3\",\n" +
                "    \"xing\",\n" +
                "    \"wufoo\",\n" +
                "    \"tripod\",\n" +
                "    \"flickr\",\n" +
                "    \"linkedin\",\n" +
                "    \"ca\",\n" +
                "    \"lycos\",\n" +
                "    \"wsj\",\n" +
                "    \"virginia\",\n" +
                "    \"vkontakte\",\n" +
                "    \"nasa\",\n" +
                "    \"drupal\",\n" +
                "    \"furl\",\n" +
                "    \"desdev\",\n" +
                "    \"dmoz\",\n" +
                "    \"prnewswire\",\n" +
                "    \"ne\",\n" +
                "    \"pagesperso-orange\",\n" +
                "    \"163\",\n" +
                "    \"usnews\",\n" +
                "    \"unc\",\n" +
                "    \"wikipedia\",\n" +
                "    \"netlog\",\n" +
                "    \"theguardian\",\n" +
                "    \"prlog\",\n" +
                "    \"alexa\",\n" +
                "    \"archive\",\n" +
                "    \"1und1\",\n" +
                "    \"samsung\",\n" +
                "    \"list-manage\",\n" +
                "    \"angelfire\",\n" +
                "    \"clickbank\",\n" +
                "    \"cdc\",\n" +
                "    \"arstechnica\",\n" +
                "    \"bluehost\",\n" +
                "    \"cbslocal\",\n" +
                "    \"ihg\",\n" +
                "    \"prweb\",\n" +
                "    \"geocities\",\n" +
                "    \"org\",\n" +
                "    \"devhub\",\n" +
                "    \"paginegialle\",\n" +
                "    \"dyndns\",\n" +
                "    \"jigsy\",\n" +
                "    \"oracle\",\n" +
                "    \"digg\",\n" +
                "    \"sphinn\",\n" +
                "    \"bigcartel\",\n" +
                "    \"blogtalkradio\",\n" +
                "    \"gizmodo\",\n" +
                "    \"soup\",\n" +
                "    \"indiatimes\",\n" +
                "    \"skype\",\n" +
                "    \"tinyurl\",\n" +
                "    \"go\",\n" +
                "    \"rambler\",\n" +
                "    \"instagram\",\n" +
                "    \"t-online\",\n" +
                "    \"vimeo\",\n" +
                "    \"yelp\",\n" +
                "    \"harvard\",\n" +
                "    \"comcast\",\n" +
                "    \"unblog\",\n" +
                "    \"wisc\",\n" +
                "    \"narod\",\n" +
                "    \"networkadvertising\",\n" +
                "    \"exblog\",\n" +
                "    \"imgur\",\n" +
                "    \"mapquest\",\n" +
                "    \"pen\",\n" +
                "    \"noaa\",\n" +
                "    \"twitpic\",\n" +
                "    \"goodreads\",\n" +
                "    \"hexun\",\n" +
                "    \"histats\",\n" +
                "    \"goo\",\n" +
                "    \"flavors\",\n" +
                "    \"uiuc\",\n" +
                "    \"disqus\",\n" +
                "    \"hugedomains\",\n" +
                "    \"washington\",\n" +
                "    \"bbb\",\n" +
                "    \"purevolume\",\n" +
                "    \"quantcast\",\n" +
                "    \"statcounter\",\n" +
                "    \"meetup\",\n" +
                "    \"cbsnews\",\n" +
                "    \"csmonitor\",\n" +
                "    \"princeton\",\n" +
                "    \"cnbc\",\n" +
                "    \"netvibes\",\n" +
                "    \"fc2\",\n" +
                "    \"dot\",\n" +
                "    \"wix\",\n" +
                "    \"msn\",\n" +
                "    \"pcworld\",\n" +
                "    \"dell\",\n" +
                "    \"blogs\",\n" +
                "    \"spiegel\",\n" +
                "    \"sun\",\n" +
                "    \"xinhuanet\",\n" +
                "    \"dagondesign\",\n" +
                "    \"4shared\",\n" +
                "    \"about\",\n" +
                "    \"foxnews\",\n" +
                "    \"gnu\",\n" +
                "    \"gmpg\",\n" +
                "    \"typepad\",\n" +
                "    \"yolasite\",\n" +
                "    \"ac\",\n" +
                "    \"tiny\",\n" +
                "    \"shinystat\",\n" +
                "    \"sciencedirect\",\n" +
                "    \"squarespace\",\n" +
                "    \"eventbrite\",\n" +
                "    \"deliciousdays\",\n" +
                "    \"phpbb\",\n" +
                "    \"net\",\n" +
                "    \"columbia\",\n" +
                "    \"surveymonkey\",\n" +
                "    \"nymag\",\n" +
                "    \"cnn\",\n" +
                "    \"sfgate\",\n" +
                "    \"skyrock\",\n" +
                "    \"ibm\",\n" +
                "    \"istockphoto\",\n" +
                "    \"mashable\",\n" +
                "    \"icio\",\n" +
                "    \"europa\",\n" +
                "    \"homestead\",\n" +
                "    \"cyberchimps\",\n" +
                "    \"epa\",\n" +
                "    \"jugem\",\n" +
                "    \"forbes\",\n" +
                "    \"blinklist\",\n" +
                "    \"dropbox\",\n" +
                "    \"fema\",\n" +
                "    \"home\",\n" +
                "    \"howstuffworks\",\n" +
                "    \"baidu\",\n" +
                "    \"ucla\",\n" +
                "    \"techcrunch\",\n" +
                "    \"dedecms\",\n" +
                "    \"etsy\",\n" +
                "    \"symantec\",\n" +
                "    \"sitemeter\",\n" +
                "    \"mit\",\n" +
                "    \"shareasale\",\n" +
                "    \"de\",\n" +
                "    \"fastcompany\",\n" +
                "    \"woothemes\",\n" +
                "    \"illinois\",\n" +
                "    \"mlb\",\n" +
                "    \"washingtonpost\",\n" +
                "    \"irs\",\n" +
                "    \"marriott\",\n" +
                "    \"nhs\",\n" +
                "    \"apple\",\n" +
                "    \"taobao\",\n" +
                "    \"microsoft\",\n" +
                "    \"usgs\",\n" +
                "    \"vistaprint\",\n" +
                "    \"elpais\",\n" +
                "    \"weibo\",\n" +
                "    \"omniture\",\n" +
                "    \"deviantart\",\n" +
                "    \"cornell\",\n" +
                "    \"comsenz\",\n" +
                "    \"usa\",\n" +
                "    \"ustream\",\n" +
                "    \"simplemachines\",\n" +
                "    \"dailymotion\",\n" +
                "    \"barnesandnoble\",\n" +
                "    \"networksolutions\",\n" +
                "    \"va\",\n" +
                "    \"chicagotribune\",\n" +
                "    \"addthis\",\n" +
                "    \"discovery\",\n" +
                "    \"upenn\",\n" +
                "    \"zimbio\",\n" +
                "    \"yellowpages\",\n" +
                "    \"printfriendly\",\n" +
                "    \"behance\",\n" +
                "    \"moonfruit\",\n" +
                "    \"technorati\",\n" +
                "    \"odnoklassniki\",\n" +
                "    \"youku\",\n" +
                "    \"unesco\",\n" +
                "    \"storify\",\n" +
                "    \"seesaa\",\n" +
                "    \"hostgator\",\n" +
                "    \"nature\",\n" +
                "    \"is\",\n" +
                "    \"hud\",\n" +
                "    \"issuu\",\n" +
                "    \"tumblr\",\n" +
                "    \"myspace\",\n" +
                "    \"weather\",\n" +
                "    \"webs\",\n" +
                "    \"xrea\",\n" +
                "    \"army\",\n" +
                "    \"bloomberg\",\n" +
                "    \"canalblog\",\n" +
                "    \"yellowbook\",\n" +
                "    \"oakley\",\n" +
                "    \"opera\",\n" +
                "    \"wiley\",\n" +
                "    \"merriam-webster\",\n" +
                "    \"mapy\",\n" +
                "    \"biblegateway\",\n" +
                "    \"businessinsider\",\n" +
                "    \"acquirethisname\",\n" +
                "    \"imageshack\",\n" +
                "    \"businesswire\",\n" +
                "    \"spotify\",\n" +
                "    \"nyu\",\n" +
                "    \"soundcloud\",\n" +
                "    \"wikimedia\",\n" +
                "    \"latimes\",\n" +
                "    \"tmall\",\n" +
                "    \"usatoday\",\n" +
                "    \"intel\",\n" +
                "    \"wp\",\n" +
                "    \"japanpost\",\n" +
                "    \"blogger\",\n" +
                "    \"posterous\",\n" +
                "    \"facebook\",\n" +
                "    \"admin\",\n" +
                "    \"blogspot\",\n" +
                "    \"bandcamp\",\n" +
                "    \"bloglovin\",\n" +
                "    \"chron\",\n" +
                "    \"t\",\n" +
                "    \"jalbum\",\n" +
                "    \"elegantthemes\",\n" +
                "    \"cloudflare\",\n" +
                "    \"photobucket\",\n" +
                "    \"nytimes\",\n" +
                "    \"wired\",\n" +
                "    \"scientificamerican\",\n" +
                "    \"mtv\",\n" +
                "    \"unicef\"\n" +
                "  ],\n" +
                "  \"productNames\": [\n" +
                "    \"span\",\n" +
                "    \"gembucket\",\n" +
                "    \"opela\",\n" +
                "    \"overhold\",\n" +
                "    \"trippledex\",\n" +
                "    \"y-solowarm\",\n" +
                "    \"hatity\",\n" +
                "    \"fix san\",\n" +
                "    \"rank\",\n" +
                "    \"aerified\",\n" +
                "    \"asoka\",\n" +
                "    \"tin\",\n" +
                "    \"veribet\",\n" +
                "    \"telegraph\",\n" +
                "    \"toughjoyfax\",\n" +
                "    \"cardguard\",\n" +
                "    \"job\",\n" +
                "    \"bamity\",\n" +
                "    \"bigtax\",\n" +
                "    \"voltsillam\",\n" +
                "    \"treeflex\",\n" +
                "    \"lotlux\",\n" +
                "    \"lotstring\",\n" +
                "    \"zoolab\",\n" +
                "    \"rakuten\",\n" +
                "    \"guardian\",\n" +
                "    \"pannier\",\n" +
                "    \"bitchip\",\n" +
                "    \"duobam\",\n" +
                "    \"flowdesk\",\n" +
                "    \"alpha\",\n" +
                "    \"biodex\",\n" +
                "    \"fixflex\",\n" +
                "    \"daltfresh\",\n" +
                "    \"konklux\",\n" +
                "    \"sonair\",\n" +
                "    \"ronstring\",\n" +
                "    \"stringtough\",\n" +
                "    \"temp\",\n" +
                "    \"subin\",\n" +
                "    \"it\",\n" +
                "    \"fintone\",\n" +
                "    \"google\",\n" +
                "    \"ventosanzap\",\n" +
                "    \"stim\",\n" +
                "    \"kanlam\",\n" +
                "    \"greenlam\",\n" +
                "    \"zontrax\",\n" +
                "    \"voyatouch\",\n" +
                "    \"vagram\",\n" +
                "    \"miibeian\",\n" +
                "    \"zaam-dox\",\n" +
                "    \"keylex\",\n" +
                "    \"flexidy\",\n" +
                "    \"ebay\",\n" +
                "    \"prodder\",\n" +
                "    \"solarbreeze\",\n" +
                "    \"tres-zap\",\n" +
                "    \"konklab\",\n" +
                "    \"zathin\",\n" +
                "    \"bitwolf\",\n" +
                "    \"redhold\",\n" +
                "    \"domainer\",\n" +
                "    \"tempsoft\",\n" +
                "    \"transcof\",\n" +
                "    \"bytecard\",\n" +
                "    \"regrant\",\n" +
                "    \"matsoft\",\n" +
                "    \"y-find\",\n" +
                "    \"viva\",\n" +
                "    \"mat lam tam\",\n" +
                "    \"alphazap\",\n" +
                "    \"tresom\",\n" +
                "    \"sonsing\",\n" +
                "    \"zamit\",\n" +
                "    \"stronghold\",\n" +
                "    \"otcom\",\n" +
                "    \"sub-ex\",\n" +
                "    \"infoseek\",\n" +
                "    \"123-reg\",\n" +
                "    \"tampflex\",\n" +
                "    \"andalax\",\n" +
                "    \"wrapsafe\",\n" +
                "    \"china\",\n" +
                "    \"hatena\",\n" +
                "    \"quo lux\",\n" +
                "    \"dion\",\n" +
                "    \"namfix\",\n" +
                "    \"amazon\",\n" +
                "    \"auda\",\n" +
                "    \"home ing\",\n" +
                "    \"cookley\",\n" +
                "    \"webeden\",\n" +
                "    \"dailymail\",\n" +
                "    \"latlux\",\n" +
                "    \"biglobe\",\n" +
                "    \"uol\",\n" +
                "    \"independent\",\n" +
                "    \"sakura\",\n" +
                "    \"holdlamis\",\n" +
                "    \"smh\",\n" +
                "    \"cardify\",\n" +
                "    \"nsw\",\n" +
                "    \"cam\",\n" +
                "    \"abc\",\n" +
                "    \"ocn\",\n" +
                "    \"oaic\",\n" +
                "    \"privacy\",\n" +
                "    \"goo\",\n" +
                "    \"miitbeian\",\n" +
                "    \"people\",\n" +
                "    \"so-net\",\n" +
                "    \"yahoo\",\n" +
                "    \"thetimes\"\n" +
                "  ]\n" +
                "}";
    }

    public static class AppBundleIdData {
        public String[] tlds;
        public String[] companyNames;
        public String[] productNames;
    }
}