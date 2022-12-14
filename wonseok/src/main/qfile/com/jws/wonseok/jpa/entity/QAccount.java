package com.jws.wonseok.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccount is a Querydsl query type for Account
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAccount extends EntityPathBase<Account> {

    private static final long serialVersionUID = 20189844L;

    public static final QAccount account = new QAccount("account");

    public final NumberPath<Long> accountId = createNumber("accountId", Long.class);

    public final NumberPath<Long> accountRepositoryId = createNumber("accountRepositoryId", Long.class);

    public final StringPath accountTypeCd = createString("accountTypeCd");

    public final DateTimePath<java.time.LocalDateTime> firstDt = createDateTime("firstDt", java.time.LocalDateTime.class);

    public QAccount(String variable) {
        super(Account.class, forVariable(variable));
    }

    public QAccount(Path<? extends Account> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccount(PathMetadata metadata) {
        super(Account.class, metadata);
    }

}

