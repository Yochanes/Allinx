package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
final class AbstractSignatureParts$computeIndexedQualifiers$1 extends Lambda implements Function1<Integer, JavaTypeQualifiers> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TypeEnhancementInfo f53107a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JavaTypeQualifiers[] f53108b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$computeIndexedQualifiers$1(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        super(1);
        this.f53107a = typeEnhancementInfo;
        this.f53108b = javaTypeQualifiersArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JavaTypeQualifiers javaTypeQualifiers;
        int iIntValue = ((Number) obj).intValue();
        TypeEnhancementInfo typeEnhancementInfo = this.f53107a;
        if (typeEnhancementInfo != null && (javaTypeQualifiers = (JavaTypeQualifiers) typeEnhancementInfo.f53195a.get(Integer.valueOf(iIntValue))) != null) {
            return javaTypeQualifiers;
        }
        if (iIntValue >= 0) {
            JavaTypeQualifiers[] javaTypeQualifiersArr = this.f53108b;
            if (iIntValue <= javaTypeQualifiersArr.length - 1) {
                return javaTypeQualifiersArr[iIntValue];
            }
        }
        return JavaTypeQualifiers.f53120e;
    }
}
