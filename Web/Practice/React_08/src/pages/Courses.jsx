import { lazy, Suspense } from "react"

const FeatureCard = lazy(() => import("../components/FeatureCard"))

export default function Courses() {
  return (
    <section>
      <h2>Courses</h2>

      <Suspense fallback={<p>Loading courses...</p>}>
        <FeatureCard title="React Basics" desc="JSX, components, props" />
        <FeatureCard title="React Router" desc="SPA navigation" />
        <FeatureCard title="Performance" desc="Lazy loading & code splitting" />
      </Suspense>
    </section>
  )
}
