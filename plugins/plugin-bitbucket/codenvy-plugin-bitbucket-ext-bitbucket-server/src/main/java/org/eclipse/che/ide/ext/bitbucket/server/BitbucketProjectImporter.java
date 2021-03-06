/*
 * Copyright (c) [2012] - [2017] Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.ext.bitbucket.server;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import javax.validation.constraints.NotNull;
import org.eclipse.che.api.core.notification.EventService;
import org.eclipse.che.api.git.GitConnectionFactory;
import org.eclipse.che.api.git.GitProjectImporter;

/**
 * {@link BitbucketProjectImporter} implementation for Bitbucket.
 *
 * @author Kevin Pollet
 */
@Singleton
public class BitbucketProjectImporter extends GitProjectImporter {
  @Inject
  public BitbucketProjectImporter(
      @NotNull final GitConnectionFactory gitConnectionFactory, EventService eventService) {
    super(gitConnectionFactory, eventService);
  }

  @Override
  public String getId() {
    return "bitbucket";
  }

  @Override
  public String getDescription() {
    return "Import project from bitbucket.";
  }
}
