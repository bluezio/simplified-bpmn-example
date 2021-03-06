/*
 * 
 */
package SimpleBPMN.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class SimpleBPMNElementTypes {

	/**
	 * @generated
	 */
	private SimpleBPMNElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			SimpleBPMN.diagram.part.SimpleBPMNDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType BusinessProcessDiagram_1000 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.BusinessProcessDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType XOR_2001 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.XOR_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OR_2002 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.OR_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AND_2003 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.AND_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Lane_2004 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Lane_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pool_2005 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Pool_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StartEvent_2010 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.StartEvent_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IntermediateEvent_2011 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.IntermediateEvent_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndEvent_2012 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.EndEvent_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Activity_2007 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Activity_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataObject_2008 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.DataObject_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_2009 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Group_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType XOR_3001 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.XOR_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OR_3002 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.OR_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AND_3003 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.AND_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Lane_3004 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Lane_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pool_3005 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Pool_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StartEvent_3006 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.StartEvent_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IntermediateEvent_3007 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.IntermediateEvent_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndEvent_3008 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.EndEvent_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Activity_3009 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Activity_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataObject_3010 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.DataObject_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Group_3011 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Group_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MessageFlow_4001 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.MessageFlow_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MessageFlow_4004 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.MessageFlow_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceFlow_4002 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.SequenceFlow_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequenceFlow_4005 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.SequenceFlow_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Association_4003 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Association_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Association_4006 = getElementType("org.eclipse.epsilon.eugenia.bpmn.diagram.Association_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(BusinessProcessDiagram_1000,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE
							.getBusinessProcessDiagram());

			elements.put(XOR_2001,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getXOR());

			elements.put(OR_2002,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getOR());

			elements.put(AND_2003,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getAND());

			elements.put(Lane_2004,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getLane());

			elements.put(Pool_2005,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getPool());

			elements.put(StartEvent_2010,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getStartEvent());

			elements.put(IntermediateEvent_2011,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE
							.getIntermediateEvent());

			elements.put(EndEvent_2012,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getEndEvent());

			elements.put(Activity_2007,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getActivity());

			elements.put(DataObject_2008,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getDataObject());

			elements.put(Group_2009,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getGroup());

			elements.put(XOR_3001,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getXOR());

			elements.put(OR_3002,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getOR());

			elements.put(AND_3003,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getAND());

			elements.put(Lane_3004,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getLane());

			elements.put(Pool_3005,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getPool());

			elements.put(StartEvent_3006,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getStartEvent());

			elements.put(IntermediateEvent_3007,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE
							.getIntermediateEvent());

			elements.put(EndEvent_3008,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getEndEvent());

			elements.put(Activity_3009,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getActivity());

			elements.put(DataObject_3010,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getDataObject());

			elements.put(Group_3011,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getGroup());

			elements.put(MessageFlow_4001,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getMessageFlow());

			elements.put(MessageFlow_4004,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getMessageFlow());

			elements.put(SequenceFlow_4002,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow());

			elements.put(SequenceFlow_4005,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow());

			elements.put(Association_4003,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getAssociation());

			elements.put(Association_4006,
					SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getAssociation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(BusinessProcessDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(XOR_2001);
			KNOWN_ELEMENT_TYPES.add(OR_2002);
			KNOWN_ELEMENT_TYPES.add(AND_2003);
			KNOWN_ELEMENT_TYPES.add(Lane_2004);
			KNOWN_ELEMENT_TYPES.add(Pool_2005);
			KNOWN_ELEMENT_TYPES.add(StartEvent_2010);
			KNOWN_ELEMENT_TYPES.add(IntermediateEvent_2011);
			KNOWN_ELEMENT_TYPES.add(EndEvent_2012);
			KNOWN_ELEMENT_TYPES.add(Activity_2007);
			KNOWN_ELEMENT_TYPES.add(DataObject_2008);
			KNOWN_ELEMENT_TYPES.add(Group_2009);
			KNOWN_ELEMENT_TYPES.add(XOR_3001);
			KNOWN_ELEMENT_TYPES.add(OR_3002);
			KNOWN_ELEMENT_TYPES.add(AND_3003);
			KNOWN_ELEMENT_TYPES.add(Lane_3004);
			KNOWN_ELEMENT_TYPES.add(Pool_3005);
			KNOWN_ELEMENT_TYPES.add(StartEvent_3006);
			KNOWN_ELEMENT_TYPES.add(IntermediateEvent_3007);
			KNOWN_ELEMENT_TYPES.add(EndEvent_3008);
			KNOWN_ELEMENT_TYPES.add(Activity_3009);
			KNOWN_ELEMENT_TYPES.add(DataObject_3010);
			KNOWN_ELEMENT_TYPES.add(Group_3011);
			KNOWN_ELEMENT_TYPES.add(MessageFlow_4001);
			KNOWN_ELEMENT_TYPES.add(MessageFlow_4004);
			KNOWN_ELEMENT_TYPES.add(SequenceFlow_4002);
			KNOWN_ELEMENT_TYPES.add(SequenceFlow_4005);
			KNOWN_ELEMENT_TYPES.add(Association_4003);
			KNOWN_ELEMENT_TYPES.add(Association_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID:
			return BusinessProcessDiagram_1000;
		case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID:
			return XOR_2001;
		case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID:
			return OR_2002;
		case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID:
			return AND_2003;
		case SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID:
			return Lane_2004;
		case SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID:
			return Pool_2005;
		case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID:
			return StartEvent_2010;
		case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID:
			return IntermediateEvent_2011;
		case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID:
			return EndEvent_2012;
		case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return Activity_2007;
		case SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID:
			return DataObject_2008;
		case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return Group_2009;
		case SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID:
			return XOR_3001;
		case SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID:
			return OR_3002;
		case SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID:
			return AND_3003;
		case SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID:
			return Lane_3004;
		case SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID:
			return Pool_3005;
		case SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID:
			return StartEvent_3006;
		case SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID:
			return IntermediateEvent_3007;
		case SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID:
			return EndEvent_3008;
		case SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID:
			return Activity_3009;
		case SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID:
			return DataObject_3010;
		case SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return Group_3011;
		case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID:
			return MessageFlow_4001;
		case SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID:
			return MessageFlow_4004;
		case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID:
			return SequenceFlow_4002;
		case SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID:
			return SequenceFlow_4005;
		case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return Association_4003;
		case SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID:
			return Association_4006;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return SimpleBPMN.diagram.providers.SimpleBPMNElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
