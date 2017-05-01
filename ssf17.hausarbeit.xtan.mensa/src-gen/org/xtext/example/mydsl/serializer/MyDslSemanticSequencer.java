/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Children;
import org.xtext.example.mydsl.myDsl.Content;
import org.xtext.example.mydsl.myDsl.Html_Class;
import org.xtext.example.mydsl.myDsl.Html_Id;
import org.xtext.example.mydsl.myDsl.Mensamodel;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CHILDREN:
				sequence_Children(context, (Children) semanticObject); 
				return; 
			case MyDslPackage.CONTENT:
				sequence_Content(context, (Content) semanticObject); 
				return; 
			case MyDslPackage.HTML_CLASS:
				sequence_Html_Class(context, (Html_Class) semanticObject); 
				return; 
			case MyDslPackage.HTML_ID:
				sequence_Html_Id(context, (Html_Id) semanticObject); 
				return; 
			case MyDslPackage.MENSAMODEL:
				sequence_Mensamodel(context, (Mensamodel) semanticObject); 
				return; 
			case MyDslPackage.TAG:
				sequence_Tag(context, (Tag) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Children returns Children
	 *
	 * Constraint:
	 *     (name=STRING tags+=Tag)
	 */
	protected void sequence_Children(ISerializationContext context, Children semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Content returns Content
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Content(ISerializationContext context, Content semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONTENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONTENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContentAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Html_Class returns Html_Class
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Html_Class(ISerializationContext context, Html_Class semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.HTML_CLASS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.HTML_CLASS__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHtml_ClassAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Html_Id returns Html_Id
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Html_Id(ISerializationContext context, Html_Id semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.HTML_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.HTML_ID__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHtml_IdAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mensamodel returns Mensamodel
	 *
	 * Constraint:
	 *     elements+=Tag+
	 */
	protected void sequence_Mensamodel(ISerializationContext context, Mensamodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tag returns Tag
	 *
	 * Constraint:
	 *     (name=STRING id=Html_Id? class=Html_Class? content=Content? children+=Children*)
	 */
	protected void sequence_Tag(ISerializationContext context, Tag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}