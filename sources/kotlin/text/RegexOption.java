package kotlin.text;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/text/RegexOption;", "Lkotlin/text/FlagEnum;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class RegexOption implements FlagEnum {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RegexOption[] f55205b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f55206c;

    /* JADX INFO: renamed from: a */
    public final int f55207a;

    static {
        RegexOption[] regexOptionArr = {new RegexOption("IGNORE_CASE", 0, 2), new RegexOption("MULTILINE", 1, 8), new RegexOption("LITERAL", 2, 16), new RegexOption("UNIX_LINES", 3, 1), new RegexOption("COMMENTS", 4, 4), new RegexOption("DOT_MATCHES_ALL", 5, 32), new RegexOption("CANON_EQ", 6, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)};
        f55205b = regexOptionArr;
        f55206c = EnumEntriesKt.m18563a(regexOptionArr);
    }

    public RegexOption(String str, int i, int i2) {
        this.f55207a = i2;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f55205b.clone();
    }

    @Override // kotlin.text.FlagEnum
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final int getF55207a() {
        return this.f55207a;
    }
}
