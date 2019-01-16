/*
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.driver.internal.metrics;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import org.neo4j.driver.internal.BoltServerAddress;
import org.neo4j.driver.internal.metrics.spi.ConnectionPoolMetrics;
import org.neo4j.driver.internal.metrics.spi.Metrics;
import org.neo4j.driver.internal.spi.ConnectionPool;

import static org.mockito.Mockito.mock;

public class InternalConnectionPoolMetricsTest
{

    @Test
    void shouldReport() throws Throwable
    {
        // Given
        ConnectionPool pool = mock( ConnectionPool.class );
        long connAcquisitionTimeoutMs = Duration.ofSeconds( 2 ).toMillis();

        ConnectionPoolMetrics poolMetrics = new InternalConnectionPoolMetrics( BoltServerAddress.LOCAL_DEFAULT, pool, connAcquisitionTimeoutMs );

        // When
        Metrics metrics = new

        // Then

    }
}
