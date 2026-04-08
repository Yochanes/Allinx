package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/JsonConfiguration;", "", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class JsonConfiguration {

    /* JADX INFO: renamed from: a */
    public final boolean f56825a;

    /* JADX INFO: renamed from: b */
    public final boolean f56826b;

    /* JADX INFO: renamed from: c */
    public final boolean f56827c;

    /* JADX INFO: renamed from: d */
    public final String f56828d;

    /* JADX INFO: renamed from: e */
    public final String f56829e;

    /* JADX INFO: renamed from: f */
    public final boolean f56830f;

    /* JADX INFO: renamed from: g */
    public final ClassDiscriminatorMode f56831g;

    public JsonConfiguration(boolean z2, boolean z3, boolean z4, String prettyPrintIndent, String classDiscriminator, boolean z5, ClassDiscriminatorMode classDiscriminatorMode) {
        Intrinsics.m18599g(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.m18599g(classDiscriminator, "classDiscriminator");
        Intrinsics.m18599g(classDiscriminatorMode, "classDiscriminatorMode");
        this.f56825a = z2;
        this.f56826b = z3;
        this.f56827c = z4;
        this.f56828d = prettyPrintIndent;
        this.f56829e = classDiscriminator;
        this.f56830f = z5;
        this.f56831g = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f56825a + ", isLenient=" + this.f56826b + ", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f56827c + ", prettyPrintIndent='" + this.f56828d + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f56829e + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f56830f + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f56831g + ')';
    }
}
