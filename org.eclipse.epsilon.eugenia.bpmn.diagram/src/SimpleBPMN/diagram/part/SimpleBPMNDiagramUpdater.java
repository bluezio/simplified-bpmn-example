/*
 * 
 */
package SimpleBPMN.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class SimpleBPMNDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor> getSemanticChildren(
			View view) {
		switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getVisualID(view)) {
		case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID:
			return getBusinessProcessDiagram_1000SemanticChildren(view);
		case SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartmentEditPart.VISUAL_ID:
			return getGroupGroupElementsCompartment_7001SemanticChildren(view);
		case SimpleBPMN.diagram.edit.parts.GroupGroupElementsCompartment2EditPart.VISUAL_ID:
			return getGroupGroupElementsCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor> getBusinessProcessDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleBPMN.BusinessProcessDiagram modelElement = (SimpleBPMN.BusinessProcessDiagram) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			SimpleBPMN.BPMNElement childElement = (SimpleBPMN.BPMNElement) it
					.next();
			int visualID = SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor> getGroupGroupElementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleBPMN.Group modelElement = (SimpleBPMN.Group) containerView
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			SimpleBPMN.BPMNElement childElement = (SimpleBPMN.BPMNElement) it
					.next();
			int visualID = SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor> getGroupGroupElementsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleBPMN.Group modelElement = (SimpleBPMN.Group) containerView
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			SimpleBPMN.BPMNElement childElement = (SimpleBPMN.BPMNElement) it
					.next();
			int visualID = SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getContainedLinks(
			View view) {
		switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getVisualID(view)) {
		case SimpleBPMN.diagram.edit.parts.BusinessProcessDiagramEditPart.VISUAL_ID:
			return getBusinessProcessDiagram_1000ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID:
			return getXOR_2001ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID:
			return getOR_2002ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID:
			return getAND_2003ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID:
			return getLane_2004ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID:
			return getPool_2005ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID:
			return getStartEvent_2010ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID:
			return getIntermediateEvent_2011ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID:
			return getEndEvent_2012ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2007ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID:
			return getDataObject_2008ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2009ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID:
			return getXOR_3001ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID:
			return getOR_3002ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID:
			return getAND_3003ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID:
			return getLane_3004ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID:
			return getPool_3005ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID:
			return getStartEvent_3006ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID:
			return getIntermediateEvent_3007ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID:
			return getEndEvent_3008ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID:
			return getActivity_3009ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID:
			return getDataObject_3010ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3011ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID:
			return getMessageFlow_4001ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID:
			return getMessageFlow_4004ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID:
			return getSequenceFlow_4002ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID:
			return getSequenceFlow_4005ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getAssociation_4003ContainedLinks(view);
		case SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID:
			return getAssociation_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIncomingLinks(
			View view) {
		switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getVisualID(view)) {
		case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID:
			return getXOR_2001IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID:
			return getOR_2002IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID:
			return getAND_2003IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID:
			return getLane_2004IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID:
			return getPool_2005IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID:
			return getStartEvent_2010IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID:
			return getIntermediateEvent_2011IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID:
			return getEndEvent_2012IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2007IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID:
			return getDataObject_2008IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2009IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID:
			return getXOR_3001IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID:
			return getOR_3002IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID:
			return getAND_3003IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID:
			return getLane_3004IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID:
			return getPool_3005IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID:
			return getStartEvent_3006IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID:
			return getIntermediateEvent_3007IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID:
			return getEndEvent_3008IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID:
			return getActivity_3009IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID:
			return getDataObject_3010IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3011IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID:
			return getMessageFlow_4001IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID:
			return getMessageFlow_4004IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID:
			return getSequenceFlow_4002IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID:
			return getSequenceFlow_4005IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getAssociation_4003IncomingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID:
			return getAssociation_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
				.getVisualID(view)) {
		case SimpleBPMN.diagram.edit.parts.XOREditPart.VISUAL_ID:
			return getXOR_2001OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.OREditPart.VISUAL_ID:
			return getOR_2002OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.ANDEditPart.VISUAL_ID:
			return getAND_2003OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.LaneEditPart.VISUAL_ID:
			return getLane_2004OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.PoolEditPart.VISUAL_ID:
			return getPool_2005OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.StartEventEditPart.VISUAL_ID:
			return getStartEvent_2010OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.IntermediateEventEditPart.VISUAL_ID:
			return getIntermediateEvent_2011OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.EndEventEditPart.VISUAL_ID:
			return getEndEvent_2012OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2007OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.DataObjectEditPart.VISUAL_ID:
			return getDataObject_2008OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2009OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.XOR2EditPart.VISUAL_ID:
			return getXOR_3001OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.OR2EditPart.VISUAL_ID:
			return getOR_3002OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.AND2EditPart.VISUAL_ID:
			return getAND_3003OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Lane2EditPart.VISUAL_ID:
			return getLane_3004OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Pool2EditPart.VISUAL_ID:
			return getPool_3005OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.StartEvent2EditPart.VISUAL_ID:
			return getStartEvent_3006OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.IntermediateEvent2EditPart.VISUAL_ID:
			return getIntermediateEvent_3007OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.EndEvent2EditPart.VISUAL_ID:
			return getEndEvent_3008OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Activity2EditPart.VISUAL_ID:
			return getActivity_3009OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.DataObject2EditPart.VISUAL_ID:
			return getDataObject_3010OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3011OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID:
			return getMessageFlow_4001OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID:
			return getMessageFlow_4004OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID:
			return getSequenceFlow_4002OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID:
			return getSequenceFlow_4005OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getAssociation_4003OutgoingLinks(view);
		case SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID:
			return getAssociation_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getBusinessProcessDiagram_1000ContainedLinks(
			View view) {
		SimpleBPMN.BusinessProcessDiagram modelElement = (SimpleBPMN.BusinessProcessDiagram) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getXOR_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOR_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAND_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getLane_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getPool_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getStartEvent_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIntermediateEvent_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getEndEvent_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getActivity_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getDataObject_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getGroup_2009ContainedLinks(
			View view) {
		SimpleBPMN.Group modelElement = (SimpleBPMN.Group) view.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getXOR_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOR_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAND_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getLane_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getPool_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getStartEvent_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIntermediateEvent_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getEndEvent_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getActivity_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getDataObject_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getGroup_3011ContainedLinks(
			View view) {
		SimpleBPMN.Group modelElement = (SimpleBPMN.Group) view.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getMessageFlow_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getMessageFlow_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getSequenceFlow_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getSequenceFlow_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAssociation_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAssociation_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getXOR_2001IncomingLinks(
			View view) {
		SimpleBPMN.XOR modelElement = (SimpleBPMN.XOR) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOR_2002IncomingLinks(
			View view) {
		SimpleBPMN.OR modelElement = (SimpleBPMN.OR) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAND_2003IncomingLinks(
			View view) {
		SimpleBPMN.AND modelElement = (SimpleBPMN.AND) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getLane_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getPool_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getStartEvent_2010IncomingLinks(
			View view) {
		SimpleBPMN.StartEvent modelElement = (SimpleBPMN.StartEvent) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIntermediateEvent_2011IncomingLinks(
			View view) {
		SimpleBPMN.IntermediateEvent modelElement = (SimpleBPMN.IntermediateEvent) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getEndEvent_2012IncomingLinks(
			View view) {
		SimpleBPMN.EndEvent modelElement = (SimpleBPMN.EndEvent) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getActivity_2007IncomingLinks(
			View view) {
		SimpleBPMN.Activity modelElement = (SimpleBPMN.Activity) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getDataObject_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getGroup_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getXOR_3001IncomingLinks(
			View view) {
		SimpleBPMN.XOR modelElement = (SimpleBPMN.XOR) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOR_3002IncomingLinks(
			View view) {
		SimpleBPMN.OR modelElement = (SimpleBPMN.OR) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAND_3003IncomingLinks(
			View view) {
		SimpleBPMN.AND modelElement = (SimpleBPMN.AND) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getLane_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getPool_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getStartEvent_3006IncomingLinks(
			View view) {
		SimpleBPMN.StartEvent modelElement = (SimpleBPMN.StartEvent) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIntermediateEvent_3007IncomingLinks(
			View view) {
		SimpleBPMN.IntermediateEvent modelElement = (SimpleBPMN.IntermediateEvent) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getEndEvent_3008IncomingLinks(
			View view) {
		SimpleBPMN.EndEvent modelElement = (SimpleBPMN.EndEvent) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getActivity_3009IncomingLinks(
			View view) {
		SimpleBPMN.Activity modelElement = (SimpleBPMN.Activity) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getDataObject_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getGroup_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getMessageFlow_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getMessageFlow_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getSequenceFlow_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getSequenceFlow_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAssociation_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAssociation_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getXOR_2001OutgoingLinks(
			View view) {
		SimpleBPMN.XOR modelElement = (SimpleBPMN.XOR) view.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOR_2002OutgoingLinks(
			View view) {
		SimpleBPMN.OR modelElement = (SimpleBPMN.OR) view.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAND_2003OutgoingLinks(
			View view) {
		SimpleBPMN.AND modelElement = (SimpleBPMN.AND) view.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getLane_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getPool_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getStartEvent_2010OutgoingLinks(
			View view) {
		SimpleBPMN.StartEvent modelElement = (SimpleBPMN.StartEvent) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIntermediateEvent_2011OutgoingLinks(
			View view) {
		SimpleBPMN.IntermediateEvent modelElement = (SimpleBPMN.IntermediateEvent) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getEndEvent_2012OutgoingLinks(
			View view) {
		SimpleBPMN.EndEvent modelElement = (SimpleBPMN.EndEvent) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getActivity_2007OutgoingLinks(
			View view) {
		SimpleBPMN.Activity modelElement = (SimpleBPMN.Activity) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getDataObject_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getGroup_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getXOR_3001OutgoingLinks(
			View view) {
		SimpleBPMN.XOR modelElement = (SimpleBPMN.XOR) view.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOR_3002OutgoingLinks(
			View view) {
		SimpleBPMN.OR modelElement = (SimpleBPMN.OR) view.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAND_3003OutgoingLinks(
			View view) {
		SimpleBPMN.AND modelElement = (SimpleBPMN.AND) view.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getLane_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getPool_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getStartEvent_3006OutgoingLinks(
			View view) {
		SimpleBPMN.StartEvent modelElement = (SimpleBPMN.StartEvent) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIntermediateEvent_3007OutgoingLinks(
			View view) {
		SimpleBPMN.IntermediateEvent modelElement = (SimpleBPMN.IntermediateEvent) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getEndEvent_3008OutgoingLinks(
			View view) {
		SimpleBPMN.EndEvent modelElement = (SimpleBPMN.EndEvent) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getActivity_3009OutgoingLinks(
			View view) {
		SimpleBPMN.Activity modelElement = (SimpleBPMN.Activity) view
				.getElement();
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getDataObject_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getGroup_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getMessageFlow_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getMessageFlow_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getSequenceFlow_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getSequenceFlow_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAssociation_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getAssociation_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getContainedTypeModelFacetLinks_MessageFlow_4001(
			SimpleBPMN.BusinessProcessDiagram container) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.MessageFlow) {
				continue;
			}
			SimpleBPMN.MessageFlow link = (SimpleBPMN.MessageFlow) linkObject;
			if (SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001,
					SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getContainedTypeModelFacetLinks_MessageFlow_4004(
			SimpleBPMN.Group container) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.MessageFlow) {
				continue;
			}
			SimpleBPMN.MessageFlow link = (SimpleBPMN.MessageFlow) linkObject;
			if (SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004,
					SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getContainedTypeModelFacetLinks_SequenceFlow_4002(
			SimpleBPMN.BusinessProcessDiagram container) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.SequenceFlow) {
				continue;
			}
			SimpleBPMN.SequenceFlow link = (SimpleBPMN.SequenceFlow) linkObject;
			if (SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002,
					SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getContainedTypeModelFacetLinks_SequenceFlow_4005(
			SimpleBPMN.Group container) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.SequenceFlow) {
				continue;
			}
			SimpleBPMN.SequenceFlow link = (SimpleBPMN.SequenceFlow) linkObject;
			if (SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005,
					SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getContainedTypeModelFacetLinks_Association_4003(
			SimpleBPMN.BusinessProcessDiagram container) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.Association) {
				continue;
			}
			SimpleBPMN.Association link = (SimpleBPMN.Association) linkObject;
			if (SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003,
					SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getContainedTypeModelFacetLinks_Association_4006(
			SimpleBPMN.Group container) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.Association) {
				continue;
			}
			SimpleBPMN.Association link = (SimpleBPMN.Association) linkObject;
			if (SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006,
					SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIncomingTypeModelFacetLinks_MessageFlow_4001(
			SimpleBPMN.FlowObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getConnectingObject_To()
					|| false == setting.getEObject() instanceof SimpleBPMN.MessageFlow) {
				continue;
			}
			SimpleBPMN.MessageFlow link = (SimpleBPMN.MessageFlow) setting
					.getEObject();
			if (SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					target,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001,
					SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIncomingTypeModelFacetLinks_MessageFlow_4004(
			SimpleBPMN.FlowObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getConnectingObject_To()
					|| false == setting.getEObject() instanceof SimpleBPMN.MessageFlow) {
				continue;
			}
			SimpleBPMN.MessageFlow link = (SimpleBPMN.MessageFlow) setting
					.getEObject();
			if (SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					target,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004,
					SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIncomingTypeModelFacetLinks_SequenceFlow_4002(
			SimpleBPMN.FlowObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getConnectingObject_To()
					|| false == setting.getEObject() instanceof SimpleBPMN.SequenceFlow) {
				continue;
			}
			SimpleBPMN.SequenceFlow link = (SimpleBPMN.SequenceFlow) setting
					.getEObject();
			if (SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					target,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002,
					SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIncomingTypeModelFacetLinks_SequenceFlow_4005(
			SimpleBPMN.FlowObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getConnectingObject_To()
					|| false == setting.getEObject() instanceof SimpleBPMN.SequenceFlow) {
				continue;
			}
			SimpleBPMN.SequenceFlow link = (SimpleBPMN.SequenceFlow) setting
					.getEObject();
			if (SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					target,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005,
					SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4003(
			SimpleBPMN.FlowObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getConnectingObject_To()
					|| false == setting.getEObject() instanceof SimpleBPMN.Association) {
				continue;
			}
			SimpleBPMN.Association link = (SimpleBPMN.Association) setting
					.getEObject();
			if (SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					target,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003,
					SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4006(
			SimpleBPMN.FlowObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SimpleBPMN.SimpleBPMNPackage.eINSTANCE
					.getConnectingObject_To()
					|| false == setting.getEObject() instanceof SimpleBPMN.Association) {
				continue;
			}
			SimpleBPMN.Association link = (SimpleBPMN.Association) setting
					.getEObject();
			if (SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject src = link.getFrom();
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					target,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006,
					SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOutgoingTypeModelFacetLinks_MessageFlow_4001(
			SimpleBPMN.FlowObject source) {
		SimpleBPMN.BusinessProcessDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SimpleBPMN.BusinessProcessDiagram) {
				container = (SimpleBPMN.BusinessProcessDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.MessageFlow) {
				continue;
			}
			SimpleBPMN.MessageFlow link = (SimpleBPMN.MessageFlow) linkObject;
			if (SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4001,
					SimpleBPMN.diagram.edit.parts.MessageFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOutgoingTypeModelFacetLinks_MessageFlow_4004(
			SimpleBPMN.FlowObject source) {
		SimpleBPMN.Group container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SimpleBPMN.Group) {
				container = (SimpleBPMN.Group) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.MessageFlow) {
				continue;
			}
			SimpleBPMN.MessageFlow link = (SimpleBPMN.MessageFlow) linkObject;
			if (SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.MessageFlow_4004,
					SimpleBPMN.diagram.edit.parts.MessageFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOutgoingTypeModelFacetLinks_SequenceFlow_4002(
			SimpleBPMN.FlowObject source) {
		SimpleBPMN.BusinessProcessDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SimpleBPMN.BusinessProcessDiagram) {
				container = (SimpleBPMN.BusinessProcessDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.SequenceFlow) {
				continue;
			}
			SimpleBPMN.SequenceFlow link = (SimpleBPMN.SequenceFlow) linkObject;
			if (SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4002,
					SimpleBPMN.diagram.edit.parts.SequenceFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOutgoingTypeModelFacetLinks_SequenceFlow_4005(
			SimpleBPMN.FlowObject source) {
		SimpleBPMN.Group container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SimpleBPMN.Group) {
				container = (SimpleBPMN.Group) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.SequenceFlow) {
				continue;
			}
			SimpleBPMN.SequenceFlow link = (SimpleBPMN.SequenceFlow) linkObject;
			if (SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.SequenceFlow_4005,
					SimpleBPMN.diagram.edit.parts.SequenceFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4003(
			SimpleBPMN.FlowObject source) {
		SimpleBPMN.BusinessProcessDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SimpleBPMN.BusinessProcessDiagram) {
				container = (SimpleBPMN.BusinessProcessDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.Association) {
				continue;
			}
			SimpleBPMN.Association link = (SimpleBPMN.Association) linkObject;
			if (SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4003,
					SimpleBPMN.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4006(
			SimpleBPMN.FlowObject source) {
		SimpleBPMN.Group container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SimpleBPMN.Group) {
				container = (SimpleBPMN.Group) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> result = new LinkedList<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleBPMN.Association) {
				continue;
			}
			SimpleBPMN.Association link = (SimpleBPMN.Association) linkObject;
			if (SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID != SimpleBPMN.diagram.part.SimpleBPMNVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SimpleBPMN.FlowObject dst = link.getTo();
			SimpleBPMN.FlowObject src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor(
					src,
					dst,
					link,
					SimpleBPMN.diagram.providers.SimpleBPMNElementTypes.Association_4006,
					SimpleBPMN.diagram.edit.parts.Association2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<SimpleBPMN.diagram.part.SimpleBPMNNodeDescriptor> getSemanticChildren(
				View view) {
			return SimpleBPMNDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getContainedLinks(
				View view) {
			return SimpleBPMNDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getIncomingLinks(
				View view) {
			return SimpleBPMNDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SimpleBPMN.diagram.part.SimpleBPMNLinkDescriptor> getOutgoingLinks(
				View view) {
			return SimpleBPMNDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
