package androidx.appcompat.app;

import android.content.res.Configuration;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.autofill.AutofillManager;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.appcompat.app.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0083c {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m365A(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ DayOfWeek[] m366B() {
        return DayOfWeek.values();
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ String m367C(DayOfWeek dayOfWeek, Locale locale) {
        return dayOfWeek.getDisplayName(TextStyle.NARROW, locale);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ TextStyle m368D() {
        return TextStyle.NARROW;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m369a(Configuration configuration) {
        return configuration.colorMode;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m370b(DayOfWeek dayOfWeek) {
        return dayOfWeek.getValue();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ CaptureRequest.Key m371c() {
        return CaptureRequest.CONTROL_ENABLE_ZSL;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ OutputConfiguration m372d(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ AutofillManager m373e(Object obj) {
        return (AutofillManager) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ Class m374f() {
        return AutofillManager.class;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ String m375g(DayOfWeek dayOfWeek, Locale locale) {
        return dayOfWeek.getDisplayName(TextStyle.FULL, locale);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ String m376h(LocalDate localDate, DateTimeFormatter dateTimeFormatter) {
        return localDate.format(dateTimeFormatter);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ String m377i(Chronology chronology, Locale locale) {
        return DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, chronology, locale);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ DayOfWeek m378j(WeekFields weekFields) {
        return weekFields.getFirstDayOfWeek();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ Instant m379k(long j) {
        return Instant.ofEpochMilli(j);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ LocalDate m380l(int i, int i2) {
        return LocalDate.of(i, i2, 1);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ LocalDate m381m(LocalDate localDate, long j) {
        return localDate.plusMonths(j);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ LocalDate m382n(ZonedDateTime zonedDateTime) {
        return zonedDateTime.toLocalDate();
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ ZoneId m383o() {
        return ZoneId.of("UTC");
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ ZonedDateTime m384p(Instant instant, ZoneId zoneId) {
        return instant.atZone(zoneId);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ ZonedDateTime m385q(ZonedDateTime zonedDateTime) {
        return zonedDateTime.withDayOfMonth(1);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ Chronology m386r(Locale locale) {
        return Chronology.ofLocale(locale);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ DateTimeFormatter m387s(Object obj) {
        return (DateTimeFormatter) obj;
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ DateTimeFormatter m388t(String str, Locale locale) {
        return DateTimeFormatter.ofPattern(str, locale);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ DateTimeFormatter m389u(DateTimeFormatter dateTimeFormatter, DecimalStyle decimalStyle) {
        return dateTimeFormatter.withDecimalStyle(decimalStyle);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ DecimalStyle m390v(Locale locale) {
        return DecimalStyle.of(locale);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ FormatStyle m391w() {
        return FormatStyle.SHORT;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ TextStyle m392x() {
        return TextStyle.FULL;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ WeekFields m393y(Locale locale) {
        return WeekFields.of(locale);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m394z(Configuration configuration, int i) {
        configuration.colorMode = i;
    }
}
