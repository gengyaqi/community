package life.majiang.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description:
 **/
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
