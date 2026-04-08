package androidx.compose.p013ui.text;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.drawscope.Fill;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Bullet implements AnnotatedString.Annotation {

    /* JADX INFO: renamed from: a */
    public final Shape f19919a = CircleShape.f19927a;

    /* JADX INFO: renamed from: b */
    public final long f19920b;

    /* JADX INFO: renamed from: c */
    public final long f19921c;

    public Bullet(long j, long j2) {
        this.f19920b = j;
        this.f19921c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Bullet)) {
            return false;
        }
        Bullet bullet = (Bullet) obj;
        Object obj2 = CircleShape.f19927a;
        if (!obj2.equals(obj2) || !TextUnit.m6673a(this.f19920b, bullet.f19920b) || !TextUnit.m6673a(this.f19921c, bullet.f19921c)) {
            return false;
        }
        Object obj3 = Fill.f17783a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        int iHashCode = CircleShape.f19927a.hashCode() * 31;
        TextUnitType[] textUnitTypeArr = TextUnit.f20574b;
        return Fill.f17783a.hashCode() + AbstractC0455a.m2226a(AbstractC0455a.m2231f(this.f19921c, AbstractC0455a.m2231f(this.f19920b, iHashCode, 31), 961), 1.0f, 31);
    }

    public final String toString() {
        return "Bullet(shape=" + CircleShape.f19927a + ", size=" + ((Object) TextUnit.m6677e(this.f19920b)) + ", padding=" + ((Object) TextUnit.m6677e(this.f19921c)) + ", brush=null, alpha=1.0, drawStyle=" + Fill.f17783a + ')';
    }
}
