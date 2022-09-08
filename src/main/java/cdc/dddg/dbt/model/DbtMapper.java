package cdc.dddg.dbt.model;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Map;


@Mapper(componentModel = "cdi")
public interface DbtMapper {


    //----------- TDBDDP -----------------
    @Mapping(source = "timestamp", target = "timestamp", dateFormat = "yyyy-MM-dd HH.mm.ss.SSSSSS")
    Tdbddp mapToTdbddp(Map<String, String> srcMap);

    @Mapping(source = "timestamp", target = "timestamp", dateFormat = "yyyy-MM-dd HH.mm.ss.SSSSSS")
    Tdbddc mapToTdbddc(Map<String, String> srcMap);

}
