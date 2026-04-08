package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
    static final TypeAdapterFactory FACTORY = new C48661();
    private final DateFormat format;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.SqlTimeTypeAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C48661 implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(null);
            }
            return null;
        }
    }

    public /* synthetic */ SqlTimeTypeAdapter(C48661 c48661) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Time read(JsonReader jsonReader) {
        return read2(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Time time) throws IOException {
        write2(jsonWriter, time);
    }

    private SqlTimeTypeAdapter() {
        this.format = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public Time read2(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.format.getTimeZone();
            try {
                try {
                    time = new Time(this.format.parse(strNextString).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e);
                }
            } finally {
                this.format.setTimeZone(timeZone);
            }
        }
        return time;
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(JsonWriter jsonWriter, Time time) throws IOException {
        String str;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.format.format((Date) time);
        }
        jsonWriter.value(str);
    }
}
