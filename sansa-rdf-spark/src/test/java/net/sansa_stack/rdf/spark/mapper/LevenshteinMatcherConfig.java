package net.sansa_stack.rdf.spark.mapper;

import org.aksw.jena_sparql_api.mapper.annotation.*;
import org.apache.jena.rdf.model.Resource;

@ResourceView
@RdfTypeNs("eg")
public interface LevenshteinMatcherConfig
        extends Resource
{
    @IriNs("eg")
    @IriType
    String getOnProperty();
    LevenshteinMatcherConfig setOnProperty(String iri);

    @IriNs("eg")
    Integer getThreshold();
    LevenshteinMatcherConfig setThreshold(Integer value);
}