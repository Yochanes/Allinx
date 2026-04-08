package kotlinx.serialization.json;

import com.king.logx.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.internal.AbstractJsonLexer;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/StringFormat;", "Default", "Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/JsonImpl;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class Json implements StringFormat {

    /* JADX INFO: renamed from: d */
    public static final Default f56807d = new Default(new JsonConfiguration(false, false, true, Logger.INDENT, "type", true, ClassDiscriminatorMode.f56802b), SerializersModuleKt.f56972a);

    /* JADX INFO: renamed from: a */
    public final JsonConfiguration f56808a;

    /* JADX INFO: renamed from: b */
    public final SerialModuleImpl f56809b;

    /* JADX INFO: renamed from: c */
    public final DescriptorSchemaCache f56810c = new DescriptorSchemaCache();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/Json;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Default extends Json {
    }

    public Json(JsonConfiguration jsonConfiguration, SerialModuleImpl serialModuleImpl) {
        this.f56808a = jsonConfiguration;
        this.f56809b = serialModuleImpl;
    }

    @Override // kotlinx.serialization.SerialFormat
    /* JADX INFO: renamed from: a */
    public final SerializersModule mo20923a() {
        return this.f56809b;
    }

    /* JADX INFO: renamed from: b */
    public final Object m21054b(DeserializationStrategy deserializationStrategy, String string) {
        Intrinsics.m18599g(string, "string");
        StringJsonLexer stringJsonLexer = new StringJsonLexer(string);
        Object objMo11301A = new StreamingJsonDecoder(this, WriteMode.f56948c, stringJsonLexer, deserializationStrategy.getDescriptor(), null).mo11301A(deserializationStrategy);
        if (stringJsonLexer.mo21073e() == 10) {
            return objMo11301A;
        }
        AbstractJsonLexer.m21068n(stringJsonLexer, "Expected EOF after parsing, but had " + stringJsonLexer.f56945e.charAt(stringJsonLexer.f56853a - 1) + " instead", 0, null, 6);
        throw null;
    }
}
