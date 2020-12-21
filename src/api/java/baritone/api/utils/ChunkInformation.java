/*
 * This file is part of Baritone.
 *
 * Baritone is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Baritone is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Baritone.  If not, see <https://www.gnu.org/licenses/>.
 */

package baritone.api.utils;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nonnull;

/**
 * A better BlockPos that has fewer hash collisions (and slightly more performant offsets)
 * <p>
 * Is it really faster to subclass BlockPos and calculate a hash in the constructor like this, taking everything into account?
 * Yes. 20% faster actually. It's called BETTER BlockPos for a reason. Source:
 * <a href="https://docs.google.com/spreadsheets/d/1GWjOjOZINkg_0MkRgKRPH1kUzxjsnEROD9u3UFh_DJc">Benchmark Spreadsheet</a>
 *
 * @author leijurv
 */
public class ChunkInformation  {
    public final IBlockState extendedblockstorage;
    public final BlockPos blockpos;

    public ChunkInformation(BlockPos blockpos, IBlockState extendedblockstorage) {
        //super(x, y, z);
        this.blockpos = blockpos;
        this.extendedblockstorage = extendedblockstorage;
    }

    public ChunkInformation() {
        //super(x, y, z);
        this.blockpos = new BlockPos(0,0,0);
        this.extendedblockstorage = null;
    }
}
