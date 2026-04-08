package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoRolloutAssignmentEncoder();

    /* JADX INFO: compiled from: Proguard */
    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {
        static final RolloutAssignmentEncoder INSTANCE = new RolloutAssignmentEncoder();
        private static final FieldDescriptor ROLLOUTID_DESCRIPTOR = FieldDescriptor.m15207of("rolloutId");
        private static final FieldDescriptor PARAMETERKEY_DESCRIPTOR = FieldDescriptor.m15207of("parameterKey");
        private static final FieldDescriptor PARAMETERVALUE_DESCRIPTOR = FieldDescriptor.m15207of("parameterValue");
        private static final FieldDescriptor VARIANTID_DESCRIPTOR = FieldDescriptor.m15207of("variantId");
        private static final FieldDescriptor TEMPLATEVERSION_DESCRIPTOR = FieldDescriptor.m15207of("templateVersion");

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            encode((RolloutAssignment) obj, objectEncoderContext);
        }

        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(ROLLOUTID_DESCRIPTOR, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(PARAMETERKEY_DESCRIPTOR, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(PARAMETERVALUE_DESCRIPTOR, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(VARIANTID_DESCRIPTOR, rolloutAssignment.getVariantId());
            objectEncoderContext.add(TEMPLATEVERSION_DESCRIPTOR, rolloutAssignment.getTemplateVersion());
        }
    }

    private AutoRolloutAssignmentEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.INSTANCE;
        encoderConfig.registerEncoder(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}
