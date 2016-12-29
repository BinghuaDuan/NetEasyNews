package cn.bproject.neteasynews.Utils;

import java.util.ArrayList;
import java.util.List;

import cn.bproject.neteasynews.bean.NewsBean;

/**
 * Created by Administrator on 2016/12/26.
 */

public class CategoryDataUtils {
    public static List<NewsBean> getNewsCategoryBeans(){
        List<NewsBean>  beans=new ArrayList<>();
        beans.add(new NewsBean("头条","","T1348647909107"));
        beans.add(new NewsBean("要闻","","T1467284926140"));
        beans.add(new NewsBean("科技","","T1348649580692"));
        beans.add(new NewsBean("财经","","T1348648756099"));
        beans.add(new NewsBean("社会","","T1348648037603"));
        beans.add(new NewsBean("军事","","T1348648141035"));
        beans.add(new NewsBean("娱乐","","T1348648517839"));
        beans.add(new NewsBean("体育","","T1348649079062"));
        beans.add(new NewsBean("数码","","T1348649776727"));

        return beans;
    }

    public static List<NewsBean> getPicCategoryBeans(){
        List<NewsBean>  beans=new ArrayList<>();
        beans.add(new NewsBean("推荐","","0031"));
        beans.add(new NewsBean("新闻","","0001"));
        beans.add(new NewsBean("热点","","0001"));
        beans.add(new NewsBean("明星","","0003"));


//        // 图片新闻尾部，需要在签名添加参数，可获得从某条新闻之后的20条新闻
//        // 示例 ： http://pic.news.163.com/photocenter/api/list/0001/00AN0001,00AO0001/0/20.json
//        public static final String endPicture = "/20.json";
//        // 图片
//        public static final String specialPictureId = "T1419316384474";
//        // 推荐图片：0031/6LRK0031,6LRI0031/    应使用瀑布流
//        public static final int RecommendPictureId = 0031;
//        public static final String RecommendPicture = PictureUrl + RecommendPictureId + "/6LRK0031,6LRI0031/";
//        // 新闻图片：0001/00AP0001,3R710001,4T8E0001/    横向排版
//        public static final int NewsPictureId = 0001;
//        public static final String NewsPicture = PictureUrl + NewsPictureId + "/00AP0001,3R710001,4T8E0001/";
//        // 热点图片：0001/00AN0001,00AO0001/     横向排版
//        public static final String HotPicture = PictureUrl + NewsPictureId +  "0001/00AN0001,00AO0001/";
//        // 明星图片：0003/00AJ0003,0AJQ0003,3LF60003,00B70003,00B50003/      瀑布流排版
//        public static final int StarPictureId = 0003;
//        public static final String StarPicture = PictureUrl + StarPictureId + "/00AJ0003,0AJQ0003,3LF60003,00B70003,00B50003/";

        return beans;
    }
}
