package io.intercom.android.sdk.utilities;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: io.intercom.android.sdk.utilities.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5852a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m16763A(NotificationChannel notificationChannel, boolean z2) {
        notificationChannel.enableLights(z2);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ Path m16764B(String[] strArr) {
        return Paths.get("..", strArr);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m16765C(NotificationChannel notificationChannel, int i) {
        notificationChannel.setLockscreenVisibility(i);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m16766D(NotificationChannel notificationChannel, boolean z2) {
        notificationChannel.enableVibration(z2);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m16767a(ZonedDateTime zonedDateTime) {
        return zonedDateTime.getHour();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ long m16768b(FileTime fileTime) {
        return fileTime.toMillis();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Notification.Builder m16769c(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ NotificationChannel m16770d() {
        return new NotificationChannel("MTPush_Private", "Notification", 3);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ NotificationChannel m16771e(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ NotificationChannel m16772f(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannel("MTPush_Private");
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ NotificationChannel m16773g(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ Intent m16774h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, 2);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ Intent m16775i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, 2);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ Class m16776j() {
        return MethodHandles.Lookup.class;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ String m16777k(ZoneId zoneId) {
        return zoneId.getId();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ String m16778l(DateTimeFormatter dateTimeFormatter, TemporalAccessor temporalAccessor) {
        return dateTimeFormatter.format(temporalAccessor);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ String m16779m(TemporalAccessor temporalAccessor) {
        return DateTimeFormatter.ISO_INSTANT.format(temporalAccessor);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ MethodHandle m16780n(MethodHandle methodHandle, Object obj) {
        return methodHandle.bindTo(obj);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ MethodHandle m16781o(MethodHandles.Lookup lookup, Method method, Class cls) {
        return lookup.unreflectSpecial(method, cls);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ MethodHandles.Lookup m16782p(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ FileVisitOption m16783q() {
        return FileVisitOption.FOLLOW_LINKS;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ LinkOption m16784r() {
        return LinkOption.NOFOLLOW_LINKS;
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ Path m16785s(Object obj) {
        return (Path) obj;
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ Path m16786t(String[] strArr) {
        return Paths.get("", strArr);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ BasicFileAttributes m16787u(Object obj) {
        return (BasicFileAttributes) obj;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ ZoneId m16788v() {
        return ZoneId.systemDefault();
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ DateTimeFormatter m16789w() {
        return DateTimeFormatter.ISO_INSTANT;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m16790x(NotificationChannel notificationChannel) {
        notificationChannel.setSound(null, null);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m16791y(NotificationChannel notificationChannel, int i) {
        notificationChannel.setImportance(i);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m16792z(NotificationChannel notificationChannel, Uri uri) {
        notificationChannel.setSound(uri, null);
    }
}
