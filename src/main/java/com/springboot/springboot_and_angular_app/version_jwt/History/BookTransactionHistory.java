package com.springboot.springboot_and_angular_app.version_jwt.History;

import com.springboot.springboot_and_angular_app.version_jwt.Book.Book;
import com.springboot.springboot_and_angular_app.version_jwt.Common.BaseEntity;
import com.springboot.springboot_and_angular_app.version_jwt.User.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookTransactionHistory extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    private boolean returned;
    private boolean returnApproved;
}
