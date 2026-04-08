package kotlin.text;

import androidx.compose.animation.AbstractC0455a;
import com.king.logx.logger.Logger;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/text/HexFormat;", "", "BytesHexFormat", "NumberHexFormat", "Builder", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@ExperimentalStdlibApi
public final class HexFormat {

    /* JADX INFO: renamed from: d */
    public static final HexFormat f55182d;

    /* JADX INFO: renamed from: a */
    public final boolean f55183a;

    /* JADX INFO: renamed from: b */
    public final BytesHexFormat f55184b;

    /* JADX INFO: renamed from: c */
    public final NumberHexFormat f55185c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/HexFormat$Builder;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "Builder", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class BytesHexFormat {

        /* JADX INFO: renamed from: a */
        public static final BytesHexFormat f55186a;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final class Builder {
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final class Companion {
        }

        static {
            BytesHexFormat bytesHexFormat = new BytesHexFormat();
            if (!HexFormatKt.m20389a("  ") && !HexFormatKt.m20389a("") && !HexFormatKt.m20389a("")) {
                HexFormatKt.m20389a("");
            }
            f55186a = bytesHexFormat;
        }

        /* JADX INFO: renamed from: a */
        public final void m20387a(String str, StringBuilder sb) {
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append("  ");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytePrefix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append("");
            sb.append("\"");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            m20387a(Logger.INDENT, sb);
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/HexFormat$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "Builder", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class NumberHexFormat {

        /* JADX INFO: renamed from: b */
        public static final NumberHexFormat f55187b = new NumberHexFormat();

        /* JADX INFO: renamed from: a */
        public final boolean f55188a = true;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final class Builder {
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public NumberHexFormat() {
            if (HexFormatKt.m20389a("")) {
                return;
            }
            HexFormatKt.m20389a("");
        }

        /* JADX INFO: renamed from: a */
        public final void m20388a(String str, StringBuilder sb) {
            sb.append(str);
            sb.append("prefix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(false);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            m20388a(Logger.INDENT, sb);
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        BytesHexFormat bytesHexFormat = BytesHexFormat.f55186a;
        NumberHexFormat numberHexFormat = NumberHexFormat.f55187b;
        f55182d = new HexFormat(false, bytesHexFormat, numberHexFormat);
        new HexFormat(true, bytesHexFormat, numberHexFormat);
    }

    public HexFormat(boolean z2, BytesHexFormat bytes, NumberHexFormat number) {
        Intrinsics.m18599g(bytes, "bytes");
        Intrinsics.m18599g(number, "number");
        this.f55183a = z2;
        this.f55184b = bytes;
        this.f55185c = number;
    }

    public final String toString() {
        StringBuilder sbM2244s = AbstractC0455a.m2244s("HexFormat(\n    upperCase = ");
        sbM2244s.append(this.f55183a);
        sbM2244s.append(",\n    bytes = BytesHexFormat(\n");
        this.f55184b.m20387a("        ", sbM2244s);
        sbM2244s.append('\n');
        sbM2244s.append("    ),");
        sbM2244s.append('\n');
        sbM2244s.append("    number = NumberHexFormat(");
        sbM2244s.append('\n');
        this.f55185c.m20388a("        ", sbM2244s);
        sbM2244s.append('\n');
        sbM2244s.append("    )");
        sbM2244s.append('\n');
        sbM2244s.append(")");
        return sbM2244s.toString();
    }
}
