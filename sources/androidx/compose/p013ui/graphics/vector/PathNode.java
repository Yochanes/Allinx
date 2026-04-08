package androidx.compose.p013ui.graphics.vector;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "ArcTo", "Close", "CurveTo", "HorizontalTo", "LineTo", "MoveTo", "QuadTo", "ReflectiveCurveTo", "ReflectiveQuadTo", "RelativeArcTo", "RelativeCurveTo", "RelativeHorizontalTo", "RelativeLineTo", "RelativeMoveTo", "RelativeQuadTo", "RelativeReflectiveCurveTo", "RelativeReflectiveQuadTo", "RelativeVerticalTo", "VerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class PathNode {

    /* JADX INFO: renamed from: a */
    public final boolean f18018a;

    /* JADX INFO: renamed from: b */
    public final boolean f18019b;

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class ArcTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18020c;

        /* JADX INFO: renamed from: d */
        public final float f18021d;

        /* JADX INFO: renamed from: e */
        public final float f18022e;

        /* JADX INFO: renamed from: f */
        public final boolean f18023f;

        /* JADX INFO: renamed from: g */
        public final boolean f18024g;

        /* JADX INFO: renamed from: h */
        public final float f18025h;

        /* JADX INFO: renamed from: i */
        public final float f18026i;

        public ArcTo(float f, float f2, float f3, boolean z2, boolean z3, float f4, float f5) {
            super(3);
            this.f18020c = f;
            this.f18021d = f2;
            this.f18022e = f3;
            this.f18023f = z2;
            this.f18024g = z3;
            this.f18025h = f4;
            this.f18026i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.f18020c, arcTo.f18020c) == 0 && Float.compare(this.f18021d, arcTo.f18021d) == 0 && Float.compare(this.f18022e, arcTo.f18022e) == 0 && this.f18023f == arcTo.f18023f && this.f18024g == arcTo.f18024g && Float.compare(this.f18025h, arcTo.f18025h) == 0 && Float.compare(this.f18026i, arcTo.f18026i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18026i) + AbstractC0455a.m2226a(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f18020c) * 31, this.f18021d, 31), this.f18022e, 31), 31, this.f18023f), 31, this.f18024g), this.f18025h, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.f18020c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.f18021d);
            sb.append(", theta=");
            sb.append(this.f18022e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f18023f);
            sb.append(", isPositiveArc=");
            sb.append(this.f18024g);
            sb.append(", arcStartX=");
            sb.append(this.f18025h);
            sb.append(", arcStartY=");
            return AbstractC0000a.m16m(sb, this.f18026i, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Close extends PathNode {

        /* JADX INFO: renamed from: c */
        public static final Close f18027c = new Close(3);
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class CurveTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18028c;

        /* JADX INFO: renamed from: d */
        public final float f18029d;

        /* JADX INFO: renamed from: e */
        public final float f18030e;

        /* JADX INFO: renamed from: f */
        public final float f18031f;

        /* JADX INFO: renamed from: g */
        public final float f18032g;

        /* JADX INFO: renamed from: h */
        public final float f18033h;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(2);
            this.f18028c = f;
            this.f18029d = f2;
            this.f18030e = f3;
            this.f18031f = f4;
            this.f18032g = f5;
            this.f18033h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.f18028c, curveTo.f18028c) == 0 && Float.compare(this.f18029d, curveTo.f18029d) == 0 && Float.compare(this.f18030e, curveTo.f18030e) == 0 && Float.compare(this.f18031f, curveTo.f18031f) == 0 && Float.compare(this.f18032g, curveTo.f18032g) == 0 && Float.compare(this.f18033h, curveTo.f18033h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18033h) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f18028c) * 31, this.f18029d, 31), this.f18030e, 31), this.f18031f, 31), this.f18032g, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.f18028c);
            sb.append(", y1=");
            sb.append(this.f18029d);
            sb.append(", x2=");
            sb.append(this.f18030e);
            sb.append(", y2=");
            sb.append(this.f18031f);
            sb.append(", x3=");
            sb.append(this.f18032g);
            sb.append(", y3=");
            return AbstractC0000a.m16m(sb, this.f18033h, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class HorizontalTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18034c;

        public HorizontalTo(float f) {
            super(3);
            this.f18034c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f18034c, ((HorizontalTo) obj).f18034c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18034c);
        }

        public final String toString() {
            return AbstractC0000a.m16m(new StringBuilder("HorizontalTo(x="), this.f18034c, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class LineTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18035c;

        /* JADX INFO: renamed from: d */
        public final float f18036d;

        public LineTo(float f, float f2) {
            super(3);
            this.f18035c = f;
            this.f18036d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.f18035c, lineTo.f18035c) == 0 && Float.compare(this.f18036d, lineTo.f18036d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18036d) + (Float.hashCode(this.f18035c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.f18035c);
            sb.append(", y=");
            return AbstractC0000a.m16m(sb, this.f18036d, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class MoveTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18037c;

        /* JADX INFO: renamed from: d */
        public final float f18038d;

        public MoveTo(float f, float f2) {
            super(3);
            this.f18037c = f;
            this.f18038d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.f18037c, moveTo.f18037c) == 0 && Float.compare(this.f18038d, moveTo.f18038d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18038d) + (Float.hashCode(this.f18037c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.f18037c);
            sb.append(", y=");
            return AbstractC0000a.m16m(sb, this.f18038d, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class QuadTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18039c;

        /* JADX INFO: renamed from: d */
        public final float f18040d;

        /* JADX INFO: renamed from: e */
        public final float f18041e;

        /* JADX INFO: renamed from: f */
        public final float f18042f;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(1);
            this.f18039c = f;
            this.f18040d = f2;
            this.f18041e = f3;
            this.f18042f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.f18039c, quadTo.f18039c) == 0 && Float.compare(this.f18040d, quadTo.f18040d) == 0 && Float.compare(this.f18041e, quadTo.f18041e) == 0 && Float.compare(this.f18042f, quadTo.f18042f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18042f) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f18039c) * 31, this.f18040d, 31), this.f18041e, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.f18039c);
            sb.append(", y1=");
            sb.append(this.f18040d);
            sb.append(", x2=");
            sb.append(this.f18041e);
            sb.append(", y2=");
            return AbstractC0000a.m16m(sb, this.f18042f, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class ReflectiveCurveTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18043c;

        /* JADX INFO: renamed from: d */
        public final float f18044d;

        /* JADX INFO: renamed from: e */
        public final float f18045e;

        /* JADX INFO: renamed from: f */
        public final float f18046f;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(2);
            this.f18043c = f;
            this.f18044d = f2;
            this.f18045e = f3;
            this.f18046f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.f18043c, reflectiveCurveTo.f18043c) == 0 && Float.compare(this.f18044d, reflectiveCurveTo.f18044d) == 0 && Float.compare(this.f18045e, reflectiveCurveTo.f18045e) == 0 && Float.compare(this.f18046f, reflectiveCurveTo.f18046f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18046f) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f18043c) * 31, this.f18044d, 31), this.f18045e, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.f18043c);
            sb.append(", y1=");
            sb.append(this.f18044d);
            sb.append(", x2=");
            sb.append(this.f18045e);
            sb.append(", y2=");
            return AbstractC0000a.m16m(sb, this.f18046f, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class ReflectiveQuadTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18047c;

        /* JADX INFO: renamed from: d */
        public final float f18048d;

        public ReflectiveQuadTo(float f, float f2) {
            super(1);
            this.f18047c = f;
            this.f18048d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.f18047c, reflectiveQuadTo.f18047c) == 0 && Float.compare(this.f18048d, reflectiveQuadTo.f18048d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18048d) + (Float.hashCode(this.f18047c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.f18047c);
            sb.append(", y=");
            return AbstractC0000a.m16m(sb, this.f18048d, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class RelativeArcTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18049c;

        /* JADX INFO: renamed from: d */
        public final float f18050d;

        /* JADX INFO: renamed from: e */
        public final float f18051e;

        /* JADX INFO: renamed from: f */
        public final boolean f18052f;

        /* JADX INFO: renamed from: g */
        public final boolean f18053g;

        /* JADX INFO: renamed from: h */
        public final float f18054h;

        /* JADX INFO: renamed from: i */
        public final float f18055i;

        public RelativeArcTo(float f, float f2, float f3, boolean z2, boolean z3, float f4, float f5) {
            super(3);
            this.f18049c = f;
            this.f18050d = f2;
            this.f18051e = f3;
            this.f18052f = z2;
            this.f18053g = z3;
            this.f18054h = f4;
            this.f18055i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.f18049c, relativeArcTo.f18049c) == 0 && Float.compare(this.f18050d, relativeArcTo.f18050d) == 0 && Float.compare(this.f18051e, relativeArcTo.f18051e) == 0 && this.f18052f == relativeArcTo.f18052f && this.f18053g == relativeArcTo.f18053g && Float.compare(this.f18054h, relativeArcTo.f18054h) == 0 && Float.compare(this.f18055i, relativeArcTo.f18055i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18055i) + AbstractC0455a.m2226a(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f18049c) * 31, this.f18050d, 31), this.f18051e, 31), 31, this.f18052f), 31, this.f18053g), this.f18054h, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.f18049c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.f18050d);
            sb.append(", theta=");
            sb.append(this.f18051e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f18052f);
            sb.append(", isPositiveArc=");
            sb.append(this.f18053g);
            sb.append(", arcStartDx=");
            sb.append(this.f18054h);
            sb.append(", arcStartDy=");
            return AbstractC0000a.m16m(sb, this.f18055i, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class RelativeCurveTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18056c;

        /* JADX INFO: renamed from: d */
        public final float f18057d;

        /* JADX INFO: renamed from: e */
        public final float f18058e;

        /* JADX INFO: renamed from: f */
        public final float f18059f;

        /* JADX INFO: renamed from: g */
        public final float f18060g;

        /* JADX INFO: renamed from: h */
        public final float f18061h;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(2);
            this.f18056c = f;
            this.f18057d = f2;
            this.f18058e = f3;
            this.f18059f = f4;
            this.f18060g = f5;
            this.f18061h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.f18056c, relativeCurveTo.f18056c) == 0 && Float.compare(this.f18057d, relativeCurveTo.f18057d) == 0 && Float.compare(this.f18058e, relativeCurveTo.f18058e) == 0 && Float.compare(this.f18059f, relativeCurveTo.f18059f) == 0 && Float.compare(this.f18060g, relativeCurveTo.f18060g) == 0 && Float.compare(this.f18061h, relativeCurveTo.f18061h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18061h) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f18056c) * 31, this.f18057d, 31), this.f18058e, 31), this.f18059f, 31), this.f18060g, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.f18056c);
            sb.append(", dy1=");
            sb.append(this.f18057d);
            sb.append(", dx2=");
            sb.append(this.f18058e);
            sb.append(", dy2=");
            sb.append(this.f18059f);
            sb.append(", dx3=");
            sb.append(this.f18060g);
            sb.append(", dy3=");
            return AbstractC0000a.m16m(sb, this.f18061h, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class RelativeHorizontalTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18062c;

        public RelativeHorizontalTo(float f) {
            super(3);
            this.f18062c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.f18062c, ((RelativeHorizontalTo) obj).f18062c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18062c);
        }

        public final String toString() {
            return AbstractC0000a.m16m(new StringBuilder("RelativeHorizontalTo(dx="), this.f18062c, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class RelativeLineTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18063c;

        /* JADX INFO: renamed from: d */
        public final float f18064d;

        public RelativeLineTo(float f, float f2) {
            super(3);
            this.f18063c = f;
            this.f18064d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.f18063c, relativeLineTo.f18063c) == 0 && Float.compare(this.f18064d, relativeLineTo.f18064d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18064d) + (Float.hashCode(this.f18063c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.f18063c);
            sb.append(", dy=");
            return AbstractC0000a.m16m(sb, this.f18064d, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class RelativeMoveTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18065c;

        /* JADX INFO: renamed from: d */
        public final float f18066d;

        public RelativeMoveTo(float f, float f2) {
            super(3);
            this.f18065c = f;
            this.f18066d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.f18065c, relativeMoveTo.f18065c) == 0 && Float.compare(this.f18066d, relativeMoveTo.f18066d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18066d) + (Float.hashCode(this.f18065c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.f18065c);
            sb.append(", dy=");
            return AbstractC0000a.m16m(sb, this.f18066d, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class RelativeQuadTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18067c;

        /* JADX INFO: renamed from: d */
        public final float f18068d;

        /* JADX INFO: renamed from: e */
        public final float f18069e;

        /* JADX INFO: renamed from: f */
        public final float f18070f;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(1);
            this.f18067c = f;
            this.f18068d = f2;
            this.f18069e = f3;
            this.f18070f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.f18067c, relativeQuadTo.f18067c) == 0 && Float.compare(this.f18068d, relativeQuadTo.f18068d) == 0 && Float.compare(this.f18069e, relativeQuadTo.f18069e) == 0 && Float.compare(this.f18070f, relativeQuadTo.f18070f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18070f) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f18067c) * 31, this.f18068d, 31), this.f18069e, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.f18067c);
            sb.append(", dy1=");
            sb.append(this.f18068d);
            sb.append(", dx2=");
            sb.append(this.f18069e);
            sb.append(", dy2=");
            return AbstractC0000a.m16m(sb, this.f18070f, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class RelativeReflectiveCurveTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18071c;

        /* JADX INFO: renamed from: d */
        public final float f18072d;

        /* JADX INFO: renamed from: e */
        public final float f18073e;

        /* JADX INFO: renamed from: f */
        public final float f18074f;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(2);
            this.f18071c = f;
            this.f18072d = f2;
            this.f18073e = f3;
            this.f18074f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.f18071c, relativeReflectiveCurveTo.f18071c) == 0 && Float.compare(this.f18072d, relativeReflectiveCurveTo.f18072d) == 0 && Float.compare(this.f18073e, relativeReflectiveCurveTo.f18073e) == 0 && Float.compare(this.f18074f, relativeReflectiveCurveTo.f18074f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18074f) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f18071c) * 31, this.f18072d, 31), this.f18073e, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.f18071c);
            sb.append(", dy1=");
            sb.append(this.f18072d);
            sb.append(", dx2=");
            sb.append(this.f18073e);
            sb.append(", dy2=");
            return AbstractC0000a.m16m(sb, this.f18074f, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class RelativeReflectiveQuadTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18075c;

        /* JADX INFO: renamed from: d */
        public final float f18076d;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(1);
            this.f18075c = f;
            this.f18076d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.f18075c, relativeReflectiveQuadTo.f18075c) == 0 && Float.compare(this.f18076d, relativeReflectiveQuadTo.f18076d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18076d) + (Float.hashCode(this.f18075c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.f18075c);
            sb.append(", dy=");
            return AbstractC0000a.m16m(sb, this.f18076d, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class RelativeVerticalTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18077c;

        public RelativeVerticalTo(float f) {
            super(3);
            this.f18077c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.f18077c, ((RelativeVerticalTo) obj).f18077c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18077c);
        }

        public final String toString() {
            return AbstractC0000a.m16m(new StringBuilder("RelativeVerticalTo(dy="), this.f18077c, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class VerticalTo extends PathNode {

        /* JADX INFO: renamed from: c */
        public final float f18078c;

        public VerticalTo(float f) {
            super(3);
            this.f18078c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f18078c, ((VerticalTo) obj).f18078c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f18078c);
        }

        public final String toString() {
            return AbstractC0000a.m16m(new StringBuilder("VerticalTo(y="), this.f18078c, ')');
        }
    }

    public PathNode(int i) {
        boolean z2 = (i & 1) == 0;
        boolean z3 = (i & 2) == 0;
        this.f18018a = z2;
        this.f18019b = z3;
    }
}
