package kotlinx.serialization.json.internal;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-serialization-json"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class JsonExceptionsKt {
    /* JADX INFO: renamed from: a */
    public static final JsonEncodingException m21116a(String output, Number number) {
        Intrinsics.m18599g(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m21122g(output, -1)));
    }

    /* JADX INFO: renamed from: b */
    public static final JsonEncodingException m21117b(SerialDescriptor keyDescriptor) {
        Intrinsics.m18599g(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.getF56610c() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getF56623b() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: c */
    public static final JsonDecodingException m21118c(int i, String message) {
        Intrinsics.m18599g(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        Intrinsics.m18599g(message, "message");
        return new JsonDecodingException(message);
    }

    /* JADX INFO: renamed from: d */
    public static final JsonDecodingException m21119d(CharSequence input, int i, String message) {
        Intrinsics.m18599g(message, "message");
        Intrinsics.m18599g(input, "input");
        return m21118c(i, message + "\nJSON input: " + ((Object) m21122g(input, i)));
    }

    /* JADX INFO: renamed from: e */
    public static final void m21120e(StringJsonLexer stringJsonLexer, String str) {
        stringJsonLexer.m21081m(stringJsonLexer.f56853a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m21121f(StringJsonLexer stringJsonLexer) {
        m21120e(stringJsonLexer, "object");
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static final CharSequence m21122g(CharSequence charSequence, int i) {
        Intrinsics.m18599g(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM2244s = AbstractC0455a.m2244s(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbM2244s.append(charSequence.subSequence(i2, i3).toString());
                sbM2244s.append(str2);
                return sbM2244s.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: h */
    public static final void m21123h(StringJsonLexer stringJsonLexer, Number number) {
        AbstractJsonLexer.m21068n(stringJsonLexer, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static final String m21124i(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m21122g(str2, -1));
    }
}
