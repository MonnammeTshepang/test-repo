package cdc.dddg;

import org.apache.avro.generic.GenericRecord;

public interface RecordMapper {
   Object map(GenericRecord genericRecord);
}
