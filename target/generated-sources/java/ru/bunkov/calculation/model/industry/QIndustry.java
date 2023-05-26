package ru.bunkov.calculation.model.industry;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIndustry is a Querydsl query type for Industry
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIndustry extends EntityPathBase<Industry> {

    private static final long serialVersionUID = 1128537528L;

    public static final QIndustry industry = new QIndustry("industry");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath name = createString("name");

    public final ListPath<Subindustry, QSubindustry> subindustry = this.<Subindustry, QSubindustry>createList("subindustry", Subindustry.class, QSubindustry.class, PathInits.DIRECT2);

    public QIndustry(String variable) {
        super(Industry.class, forVariable(variable));
    }

    public QIndustry(Path<? extends Industry> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIndustry(PathMetadata metadata) {
        super(Industry.class, metadata);
    }

}

