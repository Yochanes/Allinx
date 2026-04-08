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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    static final TypeAdapterFactory FACTORY = new C48651();
    private final DateFormat format;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.SqlDateTypeAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C48651 implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(null);
            }
            return null;
        }
    }

    public /* synthetic */ SqlDateTypeAdapter(C48651 c48651) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Date read(JsonReader jsonReader) {
        return read2(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Date date) throws IOException {
        write2(jsonWriter, date);
    }

    private SqlDateTypeAdapter() {
        this.format = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public Date read2(JsonReader jsonReader) throws IOException {
        Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.format.getTimeZone();
            try {
                try {
                    date = new Date(this.format.parse(strNextString).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e);
                }
            } finally {
                this.format.setTimeZone(timeZone);
            }
        }
        return date;
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.format.format((java.util.Date) date);
        }
        jsonWriter.value(str);
    }
}
