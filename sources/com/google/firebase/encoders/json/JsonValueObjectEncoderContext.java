package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {
    private final ObjectEncoder<Object> fallbackEncoder;
    private final boolean ignoreNullValues;
    private final JsonWriter jsonWriter;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;
    private JsonValueObjectEncoderContext childContext = null;
    private boolean active = true;

    public JsonValueObjectEncoderContext(@NonNull Writer writer, @NonNull Map<Class<?>, ObjectEncoder<?>> map, @NonNull Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder, boolean z2) {
        this.jsonWriter = new JsonWriter(writer);
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
        this.ignoreNullValues = z2;
    }

    private boolean cannotBeInline(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private JsonValueObjectEncoderContext internalAdd(@NonNull String str, @Nullable Object obj) throws IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        if (obj != null) {
            return add(obj, false);
        }
        this.jsonWriter.nullValue();
        return this;
    }

    private JsonValueObjectEncoderContext internalAddIgnoreNullValues(@NonNull String str, @Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(obj, false);
    }

    private void maybeUnNest() throws IOException {
        if (!this.active) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        JsonValueObjectEncoderContext jsonValueObjectEncoderContext = this.childContext;
        if (jsonValueObjectEncoderContext != null) {
            jsonValueObjectEncoderContext.maybeUnNest();
            this.childContext.active = false;
            this.childContext = null;
            this.jsonWriter.endObject();
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(@NonNull String str, double d) {
        return add(str, d);
    }

    public void close() {
        maybeUnNest();
        this.jsonWriter.flush();
    }

    public JsonValueObjectEncoderContext doEncode(ObjectEncoder<Object> objectEncoder, Object obj, boolean z2) throws IOException {
        if (!z2) {
            this.jsonWriter.beginObject();
        }
        objectEncoder.encode(obj, this);
        if (!z2) {
            this.jsonWriter.endObject();
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext inline(@Nullable Object obj) {
        return add(obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull String str) throws IOException {
        maybeUnNest();
        this.childContext = new JsonValueObjectEncoderContext(this);
        this.jsonWriter.name(str);
        this.jsonWriter.beginObject();
        return this.childContext;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(@NonNull String str, int i) {
        return add(str, i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(@NonNull String str, long j) {
        return add(str, j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) {
        return add(str, obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(@NonNull String str, boolean z2) {
        return add(str, z2);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ValueEncoderContext add(double d) {
        return add(d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) {
        return nested(fieldDescriptor.getName());
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ValueEncoderContext add(float f) {
        return add(f);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ValueEncoderContext add(int i) {
        return add(i);
    }

    private JsonValueObjectEncoderContext(JsonValueObjectEncoderContext jsonValueObjectEncoderContext) {
        this.jsonWriter = jsonValueObjectEncoderContext.jsonWriter;
        this.objectEncoders = jsonValueObjectEncoderContext.objectEncoders;
        this.valueEncoders = jsonValueObjectEncoderContext.valueEncoders;
        this.fallbackEncoder = jsonValueObjectEncoderContext.fallbackEncoder;
        this.ignoreNullValues = jsonValueObjectEncoderContext.ignoreNullValues;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ValueEncoderContext add(long j) {
        return add(j);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ValueEncoderContext add(@Nullable String str) {
        return add(str);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ValueEncoderContext add(boolean z2) {
        return add(z2);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public /* bridge */ /* synthetic */ ValueEncoderContext add(@Nullable byte[] bArr) {
        return add(bArr);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, @Nullable Object obj) {
        if (this.ignoreNullValues) {
            return internalAddIgnoreNullValues(str, obj);
        }
        return internalAdd(str, obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, double d) throws IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, int i) throws IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, long j) throws IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, boolean z2) throws IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(z2);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) {
        return add(fieldDescriptor.getName(), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f) {
        return add(fieldDescriptor.getName(), f);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) {
        return add(fieldDescriptor.getName(), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i) {
        return add(fieldDescriptor.getName(), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j) {
        return add(fieldDescriptor.getName(), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z2) {
        return add(fieldDescriptor.getName(), z2);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@Nullable String str) throws IOException {
        maybeUnNest();
        this.jsonWriter.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(float f) throws IOException {
        maybeUnNest();
        this.jsonWriter.value(f);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(double d) throws IOException {
        maybeUnNest();
        this.jsonWriter.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(int i) throws IOException {
        maybeUnNest();
        this.jsonWriter.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(long j) throws IOException {
        maybeUnNest();
        this.jsonWriter.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(boolean z2) throws IOException {
        maybeUnNest();
        this.jsonWriter.value(z2);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@Nullable byte[] bArr) throws IOException {
        maybeUnNest();
        if (bArr == null) {
            this.jsonWriter.nullValue();
            return this;
        }
        this.jsonWriter.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    @NonNull
    public JsonValueObjectEncoderContext add(@Nullable Object obj, boolean z2) {
        if (z2 && cannotBeInline(obj)) {
            throw new EncodingException((obj == null ? null : obj.getClass()) + " cannot be encoded inline");
        }
        if (obj == null) {
            this.jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.jsonWriter.value((Number) obj);
            return this;
        }
        int i = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            this.jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.jsonWriter.value(r6[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    add(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    add((Object) number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    add(obj2, false);
                }
            }
            this.jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                add(it.next(), false);
            }
            this.jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            this.jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    add((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.jsonWriter.endObject();
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            return doEncode(objectEncoder, obj, z2);
        }
        ValueEncoder<?> valueEncoder = this.valueEncoders.get(obj.getClass());
        if (valueEncoder != null) {
            valueEncoder.encode(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            if (obj instanceof NumberedEnum) {
                add(((NumberedEnum) obj).getNumber());
                return this;
            }
            add(((Enum) obj).name());
            return this;
        }
        return doEncode(this.fallbackEncoder, obj, z2);
    }
}
