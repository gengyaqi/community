package life.majiang.community.model;

import lombok.Data;
import sun.rmi.runtime.Log;

/**
 * @program: community
 * @description:
 **/
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmt_create;
    private Long gmt_modified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
