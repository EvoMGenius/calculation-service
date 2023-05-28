package ru.bunkov.calculation.model.calculation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import ru.bunkov.calculation.model.calculation.capitalinvestment.CapitalInvestments;


/**
 * QCapitalInvestments is a Querydsl query type for CapitalInvestments
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCapitalInvestments extends BeanPath<CapitalInvestments> {

    private static final long serialVersionUID = -93056141L;

    public static final QCapitalInvestments capitalInvestments = new QCapitalInvestments("capitalInvestments");

    public final StringPath name1 = createString("name1");

    public QCapitalInvestments(String variable) {
        super(CapitalInvestments.class, forVariable(variable));
    }

    public QCapitalInvestments(Path<? extends CapitalInvestments> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCapitalInvestments(PathMetadata metadata) {
        super(CapitalInvestments.class, metadata);
    }

}

