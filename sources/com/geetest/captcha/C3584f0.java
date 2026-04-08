package com.geetest.captcha;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.geetest.captcha.f0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, m18302d2 = {"Lcom/geetest/captcha/utils/HttpUrl;", "", "", "baseUrl", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "Lcom/geetest/captcha/utils/HttpUrl$Builder;", "newBuilder", "()Lcom/geetest/captcha/utils/HttpUrl$Builder;", "Ljava/lang/String;", "Ljava/util/Map;", "Builder", "Companion", "captcha_release"}, m18303k = 1, m18304mv = {1, 4, 1})
public final class C3584f0 {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final a f42212c = new a();

    /* JADX INFO: renamed from: a */
    public final String f42213a;

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f42214b;

    /* JADX INFO: renamed from: com.geetest.captcha.f0$a */
    /* JADX INFO: compiled from: Proguard */
    public static final class a {
        @Nullable
        /* JADX INFO: renamed from: a */
        public final C3584f0 m14320a(@NotNull String url) {
            Intrinsics.m18599g(url, "url");
            try {
                if (StringsKt.m20448x(url)) {
                    return null;
                }
                Object[] array = StringsKt.m20413K(StringsKt.m20430b0(url).toString(), new String[]{"?"}, 6).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                HashMap map = new HashMap();
                if (strArr.length == 1) {
                    return new C3584f0(strArr[0], map);
                }
                if (strArr.length != 2) {
                    return null;
                }
                Object[] array2 = StringsKt.m20413K(strArr[1], new String[]{"&"}, 6).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                for (String str : (String[]) array2) {
                    Object[] array3 = StringsKt.m20413K(str, new String[]{"="}, 6).toArray(new String[0]);
                    if (array3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr2 = (String[]) array3;
                    if (strArr2.length == 2) {
                        map.put(strArr2[0], strArr2[1]);
                    }
                }
                return new C3584f0(strArr[0], map);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public C3584f0(String str, Map<String, String> map) {
        this.f42213a = str;
        this.f42214b = map;
    }

    @NotNull
    public String toString() {
        Map<String, String> map = this.f42214b;
        if (map == null || map.isEmpty()) {
            return this.f42213a;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f42213a);
        stringBuffer.append('?');
        for (Map.Entry<String, String> entry : this.f42214b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            stringBuffer.append(key);
            stringBuffer.append('=');
            stringBuffer.append(value);
            stringBuffer.append('&');
        }
        String string = stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString();
        Intrinsics.m18598f(string, "sb.deleteCharAt(sb.length - 1).toString()");
        return string;
    }
}
