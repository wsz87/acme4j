/*
 * acme4j - Java ACME client
 *
 * Copyright (C) 2015 Richard "Shred" Körber
 *   http://acme4j.shredzone.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
package org.shredzone.acme4j.exception;

/**
 * An exception that is thrown when a rate limit was exceeded.
 *
 * @author Richard "Shred" Körber
 */
public class AcmeRateLimitExceededException extends AcmeServerException {
    private static final long serialVersionUID = 4150484059796413069L;

    /**
     * Creates a new {@link AcmeRateLimitExceededException}.
     *
     * @param type
     *            System readable error type (here
     *            {@code "urn:ietf:params:acme:error:rateLimited"})
     * @param detail
     *            Human readable error message
     */
    public AcmeRateLimitExceededException(String type, String detail) {
        super(type, detail);
    }

}
