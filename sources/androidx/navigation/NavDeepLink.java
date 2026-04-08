package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/navigation/NavDeepLink;", "", "ParamQuery", "MimeType", "Builder", "Companion", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NavDeepLink {

    /* JADX INFO: renamed from: n */
    public static final Regex f30198n = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: o */
    public static final Regex f30199o = new Regex("\\{(.+?)\\}");

    /* JADX INFO: renamed from: p */
    public static final Regex f30200p = new Regex("http[s]?://");

    /* JADX INFO: renamed from: q */
    public static final Regex f30201q = new Regex(".*");

    /* JADX INFO: renamed from: r */
    public static final Regex f30202r = new Regex("([^/]*?|)");

    /* JADX INFO: renamed from: s */
    public static final Regex f30203s = new Regex("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a */
    public final String f30204a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f30205b;

    /* JADX INFO: renamed from: c */
    public final String f30206c;

    /* JADX INFO: renamed from: d */
    public final Lazy f30207d;

    /* JADX INFO: renamed from: e */
    public final Lazy f30208e;

    /* JADX INFO: renamed from: f */
    public final Object f30209f;

    /* JADX INFO: renamed from: g */
    public boolean f30210g;

    /* JADX INFO: renamed from: h */
    public final Object f30211h;

    /* JADX INFO: renamed from: i */
    public final Object f30212i;

    /* JADX INFO: renamed from: j */
    public final Object f30213j;

    /* JADX INFO: renamed from: k */
    public final Lazy f30214k;

    /* JADX INFO: renamed from: l */
    public final Lazy f30215l;

    /* JADX INFO: renamed from: m */
    public final boolean f30216m;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "Companion", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public String f30217a;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavDeepLink$Builder$Companion;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final class Companion {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m18302d2 = {"Landroidx/navigation/NavDeepLink$Companion;", "", "Lkotlin/text/Regex;", "SCHEME_PATTERN", "Lkotlin/text/Regex;", "FILL_IN_PATTERN", "SCHEME_REGEX", "WILDCARD_REGEX", "PATH_REGEX", "QUERY_PATTERN", "", "ANY_SYMBOLS_IN_THE_TAIL", "Ljava/lang/String;", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavDeepLink$MimeType;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class MimeType implements Comparable<MimeType> {
        @Override // java.lang.Comparable
        public final int compareTo(MimeType mimeType) {
            MimeType other = mimeType;
            Intrinsics.m18599g(other, "other");
            other.getClass();
            int i = Intrinsics.m18594b(null, null) ? 2 : 0;
            return Intrinsics.m18594b(null, null) ? i + 1 : i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavDeepLink$ParamQuery;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class ParamQuery {

        /* JADX INFO: renamed from: a */
        public String f30218a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f30219b = new ArrayList();
    }

    public NavDeepLink(String str) {
        this.f30204a = str;
        ArrayList arrayList = new ArrayList();
        this.f30205b = arrayList;
        this.f30207d = LazyKt.m18299b(new C2010c(this, 1));
        this.f30208e = LazyKt.m18299b(new C2010c(this, 2));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f51423c;
        this.f30209f = LazyKt.m18298a(lazyThreadSafetyMode, new C2010c(this, 0));
        this.f30211h = LazyKt.m18298a(lazyThreadSafetyMode, new C2010c(this, 3));
        this.f30212i = LazyKt.m18298a(lazyThreadSafetyMode, new C2010c(this, 4));
        this.f30213j = LazyKt.m18298a(lazyThreadSafetyMode, new C2010c(this, 5));
        this.f30214k = LazyKt.m18299b(new C2010c(this, 6));
        this.f30215l = LazyKt.m18299b(new C2010c(this, 7));
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        Regex regex = f30198n;
        regex.getClass();
        if (!regex.f55203a.matcher(str).find()) {
            String strPattern = f30200p.f55203a.pattern();
            Intrinsics.m18598f(strPattern, "pattern(...)");
            sb.append(strPattern);
        }
        MatchResult matchResultM20396a = new Regex("(\\?|#|$)").m20396a(str);
        if (matchResultM20396a != null) {
            boolean z2 = false;
            String strSubstring = str.substring(0, matchResultM20396a.mo20393d().f51685a);
            Intrinsics.m18598f(strSubstring, "substring(...)");
            m11217a(strSubstring, arrayList, sb);
            Regex regex2 = f30201q;
            regex2.getClass();
            if (!regex2.f55203a.matcher(sb).find()) {
                Regex regex3 = f30202r;
                regex3.getClass();
                if (!regex3.f55203a.matcher(sb).find()) {
                    z2 = true;
                }
            }
            this.f30216m = z2;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        this.f30206c = m11218g(string);
    }

    /* JADX INFO: renamed from: a */
    public static void m11217a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (MatchResult matchResultM20396a = f30199o.m20396a(str); matchResultM20396a != null; matchResultM20396a = matchResultM20396a.next()) {
            MatchGroup matchGroupM20394e = matchResultM20396a.getF55199c().m20394e(1);
            Intrinsics.m18596d(matchGroupM20394e);
            arrayList.add(matchGroupM20394e.f55194a);
            if (matchResultM20396a.mo20393d().f51685a > i) {
                String strSubstring = str.substring(i, matchResultM20396a.mo20393d().f51685a);
                Intrinsics.m18598f(strSubstring, "substring(...)");
                sb.append(Regex.Companion.m20402a(strSubstring));
            }
            String strPattern = f30202r.f55203a.pattern();
            Intrinsics.m18598f(strPattern, "pattern(...)");
            sb.append(strPattern);
            i = matchResultM20396a.mo20393d().f51686b + 1;
        }
        if (i < str.length()) {
            String strSubstring2 = str.substring(i);
            Intrinsics.m18598f(strSubstring2, "substring(...)");
            sb.append(Regex.Companion.m20402a(strSubstring2));
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m11218g(String str) {
        return (StringsKt.m20434j(str, "\\Q", false) && StringsKt.m20434j(str, "\\E", false)) ? StringsKt.m20411I(str, ".*", "\\E.*\\Q") : StringsKt.m20434j(str, "\\.\\*", false) ? StringsKt.m20411I(str, "\\.\\*", ".*") : str;
    }

    /* JADX INFO: renamed from: b */
    public final int m11219b(Uri uri) {
        String str;
        if (uri == null || (str = this.f30204a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> other = NavUriUtils.m11250b(str).getPathSegments();
        Intrinsics.m18599g(pathSegments, "<this>");
        Intrinsics.m18599g(other, "other");
        LinkedHashSet linkedHashSetM18397A0 = CollectionsKt.m18397A0(pathSegments);
        linkedHashSetM18397A0.retainAll(CollectionsKt.m18456t(other));
        return linkedHashSetM18397A0.size();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX INFO: renamed from: c */
    public final ArrayList m11220c() {
        ArrayList arrayList = this.f30205b;
        Collection collectionValues = ((Map) this.f30209f.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            CollectionsKt.m18434i(arrayList2, ((ParamQuery) it.next()).f30219b);
        }
        return CollectionsKt.m18425Z(CollectionsKt.m18425Z(arrayList, arrayList2), (List) this.f30212i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX INFO: renamed from: d */
    public final Bundle m11221d(Uri deepLink, LinkedHashMap arguments) {
        MatchResult matchResultM20397c;
        MatchResult matchResultM20397c2;
        String strDecode;
        Intrinsics.m18599g(deepLink, "deepLink");
        Intrinsics.m18599g(arguments, "arguments");
        Regex regex = (Regex) this.f30207d.getValue();
        if (regex != null && (matchResultM20397c = regex.m20397c(deepLink.toString())) != null) {
            int i = 0;
            Bundle bundleM7644a = BundleKt.m7644a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (m11222e(matchResultM20397c, bundleM7644a, arguments) && (!((Boolean) this.f30208e.getValue()).booleanValue() || m11223f(deepLink, bundleM7644a, arguments))) {
                String fragment = deepLink.getFragment();
                Regex regex2 = (Regex) this.f30214k.getValue();
                if (regex2 != null && (matchResultM20397c2 = regex2.m20397c(String.valueOf(fragment))) != null) {
                    List list = (List) this.f30212i.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(list, 10));
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.m18455s0();
                            throw null;
                        }
                        String str = (String) obj;
                        MatchGroup matchGroupM20394e = matchResultM20397c2.getF55199c().m20394e(i2);
                        if (matchGroupM20394e != null) {
                            strDecode = Uri.decode(matchGroupM20394e.f55194a);
                            Intrinsics.m18598f(strDecode, "decode(...)");
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        NavArgument navArgument = (NavArgument) arguments.get(str);
                        if (navArgument != null) {
                            try {
                                navArgument.f30165a.parseAndPut(bundleM7644a, str, strDecode);
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            SavedStateWriter.m11882e(bundleM7644a, str, strDecode);
                        }
                        arrayList.add(Unit.f51459a);
                        i = i2;
                    }
                }
                if (NavArgumentKt.m11196a(arguments, new C2009b(bundleM7644a, 0)).isEmpty()) {
                    return bundleM7644a;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11222e(MatchResult matchResult, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f30205b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            String strDecode = null;
            if (i < 0) {
                CollectionsKt.m18455s0();
                throw null;
            }
            String str = (String) obj;
            MatchGroup matchGroupM20394e = matchResult.getF55199c().m20394e(i2);
            if (matchGroupM20394e != null) {
                strDecode = Uri.decode(matchGroupM20394e.f55194a);
                Intrinsics.m18598f(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            NavArgument navArgument = (NavArgument) linkedHashMap.get(str);
            if (navArgument != null) {
                try {
                    navArgument.f30165a.parseAndPut(bundle, str, strDecode);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                SavedStateWriter.m11882e(bundle, str, strDecode);
            }
            arrayList2.add(Unit.f51459a);
            i = i2;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        return Intrinsics.m18594b(this.f30204a, ((NavDeepLink) obj).f30204a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX INFO: renamed from: f */
    public final boolean m11223f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object objValueOf;
        boolean z2;
        String query;
        for (Map.Entry entry : ((Map) this.f30209f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            ParamQuery paramQuery = (ParamQuery) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f30210g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = CollectionsKt.m18413N(query);
            }
            Unit unit = Unit.f51459a;
            boolean z3 = false;
            Bundle bundleM7644a = BundleKt.m7644a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            for (String str2 : paramQuery.f30219b) {
                NavArgument navArgument = (NavArgument) linkedHashMap.get(str2);
                NavType navType = navArgument != null ? navArgument.f30165a : null;
                if ((navType instanceof CollectionNavType) && !navArgument.f30167c) {
                    CollectionNavType collectionNavType = (CollectionNavType) navType;
                    collectionNavType.put(bundleM7644a, str2, collectionNavType.mo11189a());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = paramQuery.f30218a;
                MatchResult matchResultM20397c = str4 != null ? new Regex(str4).m20397c(str3) : null;
                if (matchResultM20397c == null) {
                    return z3;
                }
                ArrayList arrayList = paramQuery.f30219b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(arrayList, 10));
                ?? r14 = z3;
                for (Object obj : arrayList) {
                    int i = r14 + 1;
                    if (r14 < 0) {
                        CollectionsKt.m18455s0();
                        throw null;
                    }
                    String key = (String) obj;
                    MatchGroup matchGroupM20394e = matchResultM20397c.getF55199c().m20394e(i);
                    String str5 = matchGroupM20394e != null ? matchGroupM20394e.f55194a : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                    NavArgument navArgument2 = (NavArgument) linkedHashMap.get(key);
                    try {
                        Intrinsics.m18599g(key, "key");
                    } catch (IllegalArgumentException unused) {
                    }
                    if (bundleM7644a.containsKey(key)) {
                        if (bundleM7644a.containsKey(key)) {
                            if (navArgument2 != null) {
                                NavType navType2 = navArgument2.f30165a;
                                navType2.parseAndPut(bundleM7644a, key, str5, navType2.get(bundleM7644a, key));
                            }
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        objValueOf = Boolean.valueOf(z2);
                        arrayList2.add(objValueOf);
                        r14 = i;
                        z3 = false;
                    } else {
                        if (navArgument2 != null) {
                            navArgument2.f30165a.parseAndPut(bundleM7644a, key, str5);
                        } else {
                            SavedStateWriter.m11882e(bundleM7644a, key, str5);
                        }
                        objValueOf = unit;
                        arrayList2.add(objValueOf);
                        r14 = i;
                        z3 = false;
                    }
                }
            }
            bundle.putAll(bundleM7644a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f30204a;
        return (str != null ? str.hashCode() : 0) * 961;
    }
}
