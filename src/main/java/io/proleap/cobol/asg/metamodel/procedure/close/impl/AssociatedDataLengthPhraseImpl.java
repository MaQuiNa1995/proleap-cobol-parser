/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.close.impl;

import io.proleap.cobol.Cobol85Parser.ClosePortFileIOUsingAssociatedDataLengthContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.asg.metamodel.procedure.close.AssociatedDataLengthPhrase;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public class AssociatedDataLengthPhraseImpl extends CobolDivisionElementImpl implements AssociatedDataLengthPhrase {

	protected ClosePortFileIOUsingAssociatedDataLengthContext ctx;

	protected ValueStmt dataLengthValueStmt;

	public AssociatedDataLengthPhraseImpl(final ProgramUnit programUnit,
			final ClosePortFileIOUsingAssociatedDataLengthContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public ValueStmt getDataLengthValueStmt() {
		return dataLengthValueStmt;
	}

	@Override
	public void setDataLengthValueStmt(final ValueStmt dataLengthValueStmt) {
		this.dataLengthValueStmt = dataLengthValueStmt;
	}

}