package life.majiang.community.model;

import lombok.Data;

/**
 * @program: community
 * @description:
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreat;
    private Long gmtModified;
    private String avatarUrl;
}
