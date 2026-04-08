package kotlin.text;

import io.intercom.android.sdk.p032m5.helpcenter.p034ui.components.C5511a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Serialized", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f55203a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/Regex$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static String m20402a(String literal) {
            Intrinsics.m18599g(literal, "literal");
            String strQuote = Pattern.quote(literal);
            Intrinsics.m18598f(strQuote, "quote(...)");
            return strQuote;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Serialized implements Serializable {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final class Companion {
        }
    }

    public Regex(String pattern) {
        Intrinsics.m18599g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.m18598f(patternCompile, "compile(...)");
        this.f55203a = patternCompile;
    }

    /* JADX INFO: renamed from: b */
    public static Sequence m20395b(Regex regex, String str) {
        regex.getClass();
        if (str.length() >= 0) {
            return SequencesKt.m20367i(new C5511a(10, regex, str), Regex$findAll$2.f55204a);
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(0, "Start index out of bounds: ", ", input length: ");
        sbM20q.append(str.length());
        throw new IndexOutOfBoundsException(sbM20q.toString());
    }

    /* JADX INFO: renamed from: a */
    public final MatchResult m20396a(String input) {
        Intrinsics.m18599g(input, "input");
        Matcher matcher = this.f55203a.matcher(input);
        Intrinsics.m18598f(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new MatcherMatchResult(matcher, input);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final MatchResult m20397c(CharSequence input) {
        Intrinsics.m18599g(input, "input");
        Matcher matcher = this.f55203a.matcher(input);
        Intrinsics.m18598f(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, input);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m20398d(CharSequence input) {
        Intrinsics.m18599g(input, "input");
        return this.f55203a.matcher(input).matches();
    }

    /* JADX INFO: renamed from: e */
    public final String m20399e(String input, String str) {
        Intrinsics.m18599g(input, "input");
        String strReplaceAll = this.f55203a.matcher(input).replaceAll(str);
        Intrinsics.m18598f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* JADX INFO: renamed from: f */
    public final String m20400f(String input, Function1 function1) {
        Intrinsics.m18599g(input, "input");
        MatchResult matchResultM20396a = m20396a(input);
        if (matchResultM20396a == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            MatcherMatchResult matcherMatchResult = (MatcherMatchResult) matchResultM20396a;
            sb.append((CharSequence) input, i, matcherMatchResult.mo20393d().f51685a);
            sb.append((CharSequence) function1.invoke(matchResultM20396a));
            i = matcherMatchResult.mo20393d().f51686b + 1;
            matchResultM20396a = matcherMatchResult.next();
            if (i >= length) {
                break;
            }
        } while (matchResultM20396a != null);
        if (i < length) {
            sb.append((CharSequence) input, i, length);
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public final List m20401g(String input) {
        Intrinsics.m18599g(input, "input");
        int iEnd = 0;
        StringsKt__StringsKt.m20456f(0);
        Matcher matcher = this.f55203a.matcher(input);
        if (!matcher.find()) {
            return CollectionsKt.m18413N(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f55203a.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }

    public Regex(String pattern, int i) {
        RegexOption[] regexOptionArr = RegexOption.f55205b;
        Intrinsics.m18599g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern, 66);
        Intrinsics.m18598f(patternCompile, "compile(...)");
        this.f55203a = patternCompile;
    }
}
