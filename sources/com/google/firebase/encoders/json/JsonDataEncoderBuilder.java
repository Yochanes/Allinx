package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {
    private static final ObjectEncoder<Object> DEFAULT_FALLBACK_ENCODER = new C4709a();
    private static final ValueEncoder<String> STRING_ENCODER = new C4710b(0);
    private static final ValueEncoder<Boolean> BOOLEAN_ENCODER = new C4710b(1);
    private static final TimestampEncoder TIMESTAMP_ENCODER = new TimestampEncoder(null);
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders = new HashMap();
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders = new HashMap();
    private ObjectEncoder<Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;
    private boolean ignoreNullValues = false;

    /* JADX INFO: compiled from: Proguard */
    public static final class TimestampEncoder implements ValueEncoder<Date> {
        private static final DateFormat rfc339;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            rfc339 = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private TimestampEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(@NonNull Object obj, @NonNull ValueEncoderContext valueEncoderContext) {
            encode((Date) obj, valueEncoderContext);
        }

        public /* synthetic */ TimestampEncoder(C47071 c47071) {
            this();
        }

        public void encode(@NonNull Date date, @NonNull ValueEncoderContext valueEncoderContext) {
            valueEncoderContext.add(rfc339.format(date));
        }
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, (ValueEncoder) STRING_ENCODER);
        registerEncoder(Boolean.class, (ValueEncoder) BOOLEAN_ENCODER);
        registerEncoder(Date.class, (ValueEncoder) TIMESTAMP_ENCODER);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15208a(Boolean bool, ValueEncoderContext valueEncoderContext) {
        lambda$static$2(bool, valueEncoderContext);
    }

    public static /* synthetic */ Map access$100(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
        return jsonDataEncoderBuilder.objectEncoders;
    }

    public static /* synthetic */ Map access$200(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
        return jsonDataEncoderBuilder.valueEncoders;
    }

    public static /* synthetic */ ObjectEncoder access$300(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
        return jsonDataEncoderBuilder.fallbackEncoder;
    }

    public static /* synthetic */ boolean access$400(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
        return jsonDataEncoderBuilder.ignoreNullValues;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15209b(Object obj, ObjectEncoderContext objectEncoderContext) {
        lambda$static$0(obj, objectEncoderContext);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15210c(String str, ValueEncoderContext valueEncoderContext) {
        lambda$static$1(str, valueEncoderContext);
    }

    private static /* synthetic */ void lambda$static$0(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    private static /* synthetic */ void lambda$static$1(String str, ValueEncoderContext valueEncoderContext) {
        valueEncoderContext.add(str);
    }

    private static /* synthetic */ void lambda$static$2(Boolean bool, ValueEncoderContext valueEncoderContext) {
        valueEncoderContext.add(bool.booleanValue());
    }

    @NonNull
    public DataEncoder build() {
        return new C47071();
    }

    @NonNull
    public JsonDataEncoderBuilder configureWith(@NonNull Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder ignoreNullValues(boolean z2) {
        this.ignoreNullValues = z2;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        return registerEncoder(cls, objectEncoder);
    }

    @NonNull
    public JsonDataEncoderBuilder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
        this.fallbackEncoder = objectEncoder;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        return registerEncoder(cls, valueEncoder);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ObjectEncoder<? super T> objectEncoder) {
        this.objectEncoders.put(cls, objectEncoder);
        this.valueEncoders.remove(cls);
        return this;
    }

    /* JADX INFO: renamed from: com.google.firebase.encoders.json.JsonDataEncoderBuilder$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C47071 implements DataEncoder {
        public C47071() {
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public void encode(@NonNull Object obj, @NonNull Writer writer) {
            JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.access$100(JsonDataEncoderBuilder.this), JsonDataEncoderBuilder.access$200(JsonDataEncoderBuilder.this), JsonDataEncoderBuilder.access$300(JsonDataEncoderBuilder.this), JsonDataEncoderBuilder.access$400(JsonDataEncoderBuilder.this));
            jsonValueObjectEncoderContext.add(obj, false);
            jsonValueObjectEncoderContext.close();
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public String encode(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                encode(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ValueEncoder<? super T> valueEncoder) {
        this.valueEncoders.put(cls, valueEncoder);
        this.objectEncoders.remove(cls);
        return this;
    }
}
