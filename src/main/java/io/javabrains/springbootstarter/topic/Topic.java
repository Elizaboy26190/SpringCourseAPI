package io.javabrains.springbootstarter.topic;


import lombok.*;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Topic {
    private String id;
    private String name;
    private String description;
}
