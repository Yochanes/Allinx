package com.google.common.p027io;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.os.StrictMode;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.google.firebase.messaging.CommonNotificationBuilder;
import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.io.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4465b {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m15001A(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ AclEntryFlag m15002B() {
        return AclEntryFlag.FILE_INHERIT;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ DateTimeFormatter m15003C() {
        return DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Set m15004D() {
        return PosixFilePermissions.fromString("rw-------");
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m15005a(Instant instant) {
        return instant.getNano();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ long m15006b(Instant instant) {
        return instant.getEpochSecond();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ NotificationChannel m15007c(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ NotificationChannel m15008d(String str) {
        return new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, str, 3);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ VibrationEffect m15009e() {
        return VibrationEffect.createOneShot(40L, -1);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ File m15010f(Path path) {
        return path.toFile();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ String m15011g(LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ FileSystem m15012h() {
        return FileSystems.getDefault();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ Path m15013i(Path path, String str, FileAttribute[] fileAttributeArr) {
        return Files.createTempFile(path, str, null, fileAttributeArr);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ Path m15014j(Path path, FileAttribute[] fileAttributeArr) {
        return Files.createTempDirectory(path, null, fileAttributeArr);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ AclEntry.Builder m15015k(AclEntry.Builder builder, EnumSet enumSet) {
        return builder.setPermissions(enumSet);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ AclEntry.Builder m15016l(AclEntry.Builder builder, AclEntryFlag[] aclEntryFlagArr) {
        return builder.setFlags(aclEntryFlagArr);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AclEntryFlag m15017m() {
        return AclEntryFlag.DIRECTORY_INHERIT;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ FileAttribute m15018n(Set set) {
        return PosixFilePermissions.asFileAttribute(set);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ Instant m15019o(long j, long j2) {
        return Instant.ofEpochSecond(j, j2);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ Instant m15020p(Date date) {
        return date.toInstant();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ LocalDateTime m15021q(OffsetDateTime offsetDateTime) {
        return offsetDateTime.toLocalDateTime();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ OffsetDateTime m15022r(Instant instant) {
        return instant.atOffset(ZoneOffset.UTC);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ ZoneOffset m15023s() {
        return ZoneOffset.UTC;
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ ZonedDateTime m15024t(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ DateTimeFormatter m15025u() {
        return DateTimeFormatter.ISO_LOCAL_DATE;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ TemporalAccessor m15026v(Object obj) {
        return (TemporalAccessor) obj;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ Set m15027w() {
        return PosixFilePermissions.fromString("rwx------");
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ Set m15028x(FileSystem fileSystem) {
        return fileSystem.supportedFileAttributeViews();
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m15029y(StrictMode.ThreadPolicy.Builder builder) {
        builder.detectUnbufferedIo();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m15030z(Vibrator vibrator, VibrationEffect vibrationEffect) {
        vibrator.vibrate(vibrationEffect);
    }
}
