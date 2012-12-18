import Data.IORef

fac n = do
           resultRef <- newIORef 1
           iRef <- newIORef 1
           for iRef (<=n) (+1) (do
               i <- readIORef iRef
               modifyIORef resultRef (*i))
           result <- readIORef resultRef
           return result
 where
  for ref cond adjust body = do
      val <- readIORef ref
      if cond val
         then do body
                 modifyIORef ref adjust
                 for ref cond adjust body
         else return ()