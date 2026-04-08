package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/Composer;", "", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public class Composer {

    /* JADX INFO: renamed from: a */
    public final JsonToStringWriter f56878a;

    /* JADX INFO: renamed from: b */
    public boolean f56879b = true;

    public Composer(JsonToStringWriter jsonToStringWriter) {
        this.f56878a = jsonToStringWriter;
    }

    /* JADX INFO: renamed from: a */
    public void mo21103a() {
        this.f56879b = true;
    }

    /* JADX INFO: renamed from: b */
    public void mo21104b() {
        this.f56879b = false;
    }

    /* JADX INFO: renamed from: c */
    public void mo21105c() {
        this.f56879b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo21106d(byte b2) {
        this.f56878a.m21134d(b2);
    }

    /* JADX INFO: renamed from: e */
    public final void m21107e(char c2) {
        JsonToStringWriter jsonToStringWriter = this.f56878a;
        jsonToStringWriter.m21131a(jsonToStringWriter.f56896b, 1);
        char[] cArr = jsonToStringWriter.f56895a;
        int i = jsonToStringWriter.f56896b;
        jsonToStringWriter.f56896b = i + 1;
        cArr[i] = c2;
    }

    /* JADX INFO: renamed from: f */
    public void mo21108f(int i) {
        this.f56878a.m21134d(i);
    }

    /* JADX INFO: renamed from: g */
    public void mo21109g(long j) {
        this.f56878a.m21134d(j);
    }

    /* JADX INFO: renamed from: h */
    public final void m21110h(String v) {
        Intrinsics.m18599g(v, "v");
        this.f56878a.m21133c(v);
    }

    /* JADX INFO: renamed from: i */
    public void mo21111i(short s) {
        this.f56878a.m21134d(s);
    }

    /* JADX INFO: renamed from: j */
    public void mo21112j(String value) {
        byte b2;
        Intrinsics.m18599g(value, "value");
        JsonToStringWriter jsonToStringWriter = this.f56878a;
        jsonToStringWriter.m21131a(jsonToStringWriter.f56896b, value.length() + 2);
        char[] cArr = jsonToStringWriter.f56895a;
        int i = jsonToStringWriter.f56896b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c2 = cArr[i4];
            byte[] bArr = StringOpsKt.f56947b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = value.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    jsonToStringWriter.m21131a(i4, 2);
                    char cCharAt = value.charAt(i5);
                    byte[] bArr2 = StringOpsKt.f56947b;
                    if (cCharAt >= bArr2.length || (b2 = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        jsonToStringWriter.f56895a[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b2 == 1) {
                            String str = StringOpsKt.f56946a[cCharAt];
                            Intrinsics.m18596d(str);
                            jsonToStringWriter.m21131a(i4, str.length());
                            str.getChars(0, str.length(), jsonToStringWriter.f56895a, i4);
                            int length3 = str.length() + i4;
                            jsonToStringWriter.f56896b = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = jsonToStringWriter.f56895a;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b2;
                            i4 += 2;
                            jsonToStringWriter.f56896b = i4;
                        }
                    }
                }
                jsonToStringWriter.m21131a(i4, 1);
                jsonToStringWriter.f56895a[i4] = '\"';
                jsonToStringWriter.f56896b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        jsonToStringWriter.f56896b = i3 + 1;
    }

    /* JADX INFO: renamed from: k */
    public void mo21113k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo21114l() {
    }
}
