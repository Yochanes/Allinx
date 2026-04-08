package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
    static final TypeAdapterFactory FACTORY = new C48671();
    private final TypeAdapter<Date> dateTypeAdapter;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.SqlTimestampTypeAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C48671 implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.getAdapter(Date.class), null);
            }
            return null;
        }
    }

    public /* synthetic */ SqlTimestampTypeAdapter(TypeAdapter typeAdapter, C48671 c48671) {
        this(typeAdapter);
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Timestamp read(JsonReader jsonReader) {
        return read2(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Timestamp timestamp) {
        write2(jsonWriter, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.dateTypeAdapter = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public Timestamp read2(JsonReader jsonReader) {
        Date date = this.dateTypeAdapter.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(JsonWriter jsonWriter, Timestamp timestamp) {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }
}
