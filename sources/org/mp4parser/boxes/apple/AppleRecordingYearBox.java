package org.mp4parser.boxes.apple;

import io.intercom.android.sdk.models.AttributeType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AppleRecordingYearBox extends AppleDataBox {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58309o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58310p;

    static {
        Factory factory = new Factory(AppleRecordingYearBox.class, "AppleRecordingYearBox.java");
        f58309o = factory.m21739e(factory.m21738d("getDate", "org.mp4parser.boxes.apple.AppleRecordingYearBox", "", "", "", "java.util.Date"));
        f58310p = factory.m21739e(factory.m21738d("setDate", "org.mp4parser.boxes.apple.AppleRecordingYearBox", "java.util.Date", AttributeType.DATE, "", "void"));
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: d */
    public final int mo21822d() {
        throw null;
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: e */
    public final byte[] mo21823e() {
        throw null;
    }
}
