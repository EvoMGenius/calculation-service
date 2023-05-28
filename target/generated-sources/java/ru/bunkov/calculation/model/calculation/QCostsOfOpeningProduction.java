package ru.bunkov.calculation.model.calculation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import ru.bunkov.calculation.model.calculation.openingproductioncost.CostsOfOpeningProduction;


/**
 * QCostsOfOpeningProduction is a Querydsl query type for CostsOfOpeningProduction
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCostsOfOpeningProduction extends BeanPath<CostsOfOpeningProduction> {

    private static final long serialVersionUID = -129648465L;

    public static final QCostsOfOpeningProduction costsOfOpeningProduction = new QCostsOfOpeningProduction("costsOfOpeningProduction");

    public final StringPath name2 = createString("name2");

    public QCostsOfOpeningProduction(String variable) {
        super(CostsOfOpeningProduction.class, forVariable(variable));
    }

    public QCostsOfOpeningProduction(Path<? extends CostsOfOpeningProduction> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCostsOfOpeningProduction(PathMetadata metadata) {
        super(CostsOfOpeningProduction.class, metadata);
    }

}

