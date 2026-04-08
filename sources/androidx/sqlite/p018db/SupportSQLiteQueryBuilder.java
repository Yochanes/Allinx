package androidx.sqlite.p018db;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "", "Companion", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SupportSQLiteQueryBuilder {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder$Companion;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "limitPattern", "Ljava/util/regex/Pattern;", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    }
}
