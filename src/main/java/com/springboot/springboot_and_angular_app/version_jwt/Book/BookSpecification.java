package com.springboot.springboot_and_angular_app.version_jwt.Book;

import org.springframework.data.jpa.domain.Specification;

public class BookSpecification {

    public static Specification<Book> withOwnerId(Integer ownerId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("owner").get("id"), ownerId);
    }
}
