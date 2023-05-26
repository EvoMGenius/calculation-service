package ru.bunkov.calculation.model.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomUser is a Querydsl query type for CustomUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCustomUser extends EntityPathBase<CustomUser> {

    private static final long serialVersionUID = -607515351L;

    public static final QCustomUser customUser = new QCustomUser("customUser");

    public final ListPath<ru.bunkov.calculation.model.Calculation, ru.bunkov.calculation.model.QCalculation> calculations = this.<ru.bunkov.calculation.model.Calculation, ru.bunkov.calculation.model.QCalculation>createList("calculations", ru.bunkov.calculation.model.Calculation.class, ru.bunkov.calculation.model.QCalculation.class, PathInits.DIRECT2);

    public final StringPath city = createString("city");

    public final StringPath country = createString("country");

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath industry = createString("industry");

    public final StringPath lastName = createString("lastName");

    public final StringPath middleName = createString("middleName");

    public final StringPath organizationName = createString("organizationName");

    public final StringPath password = createString("password");

    public final StringPath position = createString("position");

    public final EnumPath<Role> role = createEnum("role", Role.class);

    public final StringPath taxpayerNumber = createString("taxpayerNumber");

    public QCustomUser(String variable) {
        super(CustomUser.class, forVariable(variable));
    }

    public QCustomUser(Path<? extends CustomUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomUser(PathMetadata metadata) {
        super(CustomUser.class, metadata);
    }

}

